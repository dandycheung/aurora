## Window - window APIs

Every Aurora-powered window is created using the `AuroraWindow` API. The signature of this function draws on its counterpart from the core Compose, `Window`, and adds a few Aurora-specific parameters:

| Parameter | Type | Meaning |
| --- | --- | --- |
| **skin** | AuroraSkinDefinition | [Skin](../theming/skins/overview.md) for the window content |
| | MutableState&lt;AuroraSkinDefinition&gt; | [Skin](../theming/skins/overview.md) for the window content. Can be updated at runtime, which will then cause recomposition of the window content based on the new skin. |
| **iconFilterStrategy** | IconFilterStrategy | Icon filter strategy to apply on the window icon, if present |
| **menuCommands** | CommandGroup | If present, is used to create the menu bar of this window |

### Setting window skin

If you're not planning to allow the user to change the window skin at runtime (that is, your application has fixed design), use the `AuroraWindow` API that accepts `AuroraSkinDefintion` like this:

```kotlin
AuroraWindow(
    skin = marinerSkin(),
    title = "Aurora Demo",
    ...
) {
  // Content
}
```

### Dynamically changing window skin

If you want to allows the use to change the window skin at runtime, use the `AuroraWindow` API that accepts `MutableState<AuroraSkinDefinition>`.

First, create the state variable that will hold the currently selected skin:

```kotlin
val skin = mutableStateOf(marinerSkin())
```

Then, create your `AuroraWindow` as before:

```kotlin
AuroraWindow(
    skin = skin,
    title = "Aurora Demo",
    ...
) {
  // Content
}
```

And finally, add the skin selection functionality to your UI. Such functionality can be in a settings dialog, a window-level menu, a dropdown in your toolbar / footer, or any other way your design calls for.

Here is sample implementation of switching the window skin as a combobox:

```kotlin
@Composable
fun AuroraSkinSwitcher(
  auroraSkinDefinition: MutableState<AuroraSkinDefinition>,
  popupPlacementStrategy: PopupPlacementStrategy = PopupPlacementStrategy.Downward.HAlignStart
) {
  val currentSkinDisplayName = AuroraSkin.displayName
  val auroraSkins = getAuroraSkins()
  val selectedSkinItem =
    remember { mutableStateOf(auroraSkins.first { it.first == currentSkinDisplayName }) }

  ComboBoxProjection(
    contentModel = ComboBoxContentModel(
      items = auroraSkins,
      selectedItem = selectedSkinItem.value,
      onTriggerItemSelectedChange = {
        selectedSkinItem.value = it
        auroraSkinDefinition.value = it.second.invoke()
      }
    ),
    presentationModel = ComboBoxPresentationModel(
      displayConverter = { it.first },
      popupPlacementStrategy = popupPlacementStrategy
    )
  ).project()
}
```

The moving pieces:

* Use `AuroraSkin.displayName` to get the display name of the current Aurora skin
* Use `getAuroraSkins()` to get the list of all core Aurora skins
* Find the current skin in this list, and set it as `selectedItem` in the combobox content model
* Wire `onTriggerItemSelectedChange` to update the selected skin - which will cause the window content to be recomposed
* Use `displayConverter` in the presentation model to use the skin display name

Here is how this popup looks like:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/aurora/icicle/docs/images/window/skin-switcher.png" width="199" border=0>

### Menu bar

Use `menuCommands` to specify the menu bar content of your window:

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/aurora/icicle/docs/images/window/menubar.png" width="646" border=0>

And the code skeleton:

```kotlin
AuroraWindow(
  skin = skin,
  title = "Aurora skeleton",
  undecorated = true,
  ...
  menuCommands = CommandGroup(
    commands = listOf(
      Command(
        text = resourceBundle.value.getString("Menu.file"),
        secondaryContentModel = CommandMenuContentModel(
          CommandGroup(
            commands = listOf(
              Command(
                text = resourceBundle.value.getString("Menu.file.new"),
                action = { println("New file!") }),
              Command(
                text = resourceBundle.value.getString("Menu.file.open"),
                action = { println("Open file!") }),
              Command(
                text = resourceBundle.value.getString("Menu.file.save"),
                action = { println("Save file!") })
            )
          )
        )
      ),
      Command(
        text = resourceBundle.value.getString("Menu.edit"),
        action = { println("Edit activated!") }),
      Command(
        text = resourceBundle.value.getString("Menu.source"),
        action = { println("Source activated!") }),
      Command(
        text = resourceBundle.value.getString("Menu.refactor"),
        action = { println("Refactor activated!") }),
      Command(
        text = resourceBundle.value.getString("Menu.navigate"),
        action = { println("Navigate activated!") }),
      Command(
        text = resourceBundle.value.getString("Menu.search"),
        action = { println("Search activated!") }),
      Command(
        text = resourceBundle.value.getString("Menu.project"),
        action = { println("Project activated!") })
    )
  )
) {
    // Content
}
```

### Working with locales

The `AuroraWindow` function gets its content in the `AuroraWindowScope`. To make working with locales and resource bundles a bit easier, `AuroraWindowScope` implements the same `AuroraLocaleScope` as `AuroraApplicationScope` does.

This means that you can access (read and write) the `applicationLocale` information from any function in `AuroraWindowScope`.
