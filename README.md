# Clique Themes

Pre-built color themes for the [Clique](https://github.com/kusoroadeolu/Clique) terminal styling library.

## What's This?

This package provides popular terminal color schemes that work seamlessly with Clique. Instead of defining colors manually, you can use carefully crafted palettes from well-known themes like Catppuccin, Dracula, Nord, and more.

## Available Themes

- **catppuccin-mocha** - Pastel dark theme with soothing colors
- **catppuccin-latte** - Pastel light theme variant
- **dracula** - Iconic purple-accented dark theme
- **gruvbox-dark** - Retro warm dark palette
- **gruvbox-light** - Retro warm light palette
- **nord** - Cool arctic-inspired color scheme
- **tokyo-night** - Modern purple-blue dark theme

## Quick Start

### Installation

**Maven:**
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <!-- Core library -->
    <dependency>
        <groupId>com.github.kusoroadeolu</groupId>
        <artifactId>Clique</artifactId>
        <version>v2.0.0</version>
    </dependency>
    
    <!-- Themes -->
    <dependency>
        <groupId>com.github.kusoroadeolu</groupId>
        <artifactId>clique-themes</artifactId>
        <version>v0.0.1</version>
    </dependency>
</dependencies>
```

**Gradle:**
```gradle
dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	repositories {
		mavenCentral()
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
    implementation 'com.github.kusoroadeolu:Clique:v2.0.0'
    implementation 'com.github.kusoroadeolu:clique-themes:v0.0.1'
}
```

### Usage

```java
import com.github.kusoroadeolu.clique.Clique;

public class App {
    public static void main(String[] args) {
        // Register a theme
        Clique.registerTheme("catppuccin-mocha");
        
        // Use theme colors
        Clique.parser().print("[ctp_mauve]Styled with Catppuccin![/]");
        Clique.parser().print("[ctp_red]Error:[/] [ctp_text]Something went wrong[/]");
        
        // Or register all themes at once
        Clique.registerAllThemes();
        Clique.parser().print("[nord_frost0]Nord[/] meets [drac_pink]Dracula[/]");
    }
}
```

## Documentation

For complete documentation on:
- Using theme colors in your markup
- Full color palette references for each theme
- Creating your own custom themes
- Advanced styling patterns

**Visit the [Clique documentation](https://github.com/kusoroadeolu/Clique/tree/main/docs)**

Specifically check out:
- [Themes Guide](https://github.com/kusoroadeolu/Clique/blob/main/docs/themes.md) - How to use pre-built themes
- [Build Your Own Theme](https://github.com/kusoroadeolu/Clique/blob/main/docs/build-your-own-theme.md) - Create custom themes
- [Markup Reference](https://github.com/kusoroadeolu/Clique/blob/main/docs/markup-reference.md) - All available color tags

## Examples

Want to see these themes in action? Check out the [Clique Demos](https://github.com/kusoroadeolu/clique-demos) repo for interactive examples including a theme showcase.

## License
MIT License - see [LICENSE](LICENSE) file for details.

## Links

- [Clique Library](https://github.com/kusoroadeolu/Clique) - Main library
- [Clique Demos](https://github.com/kusoroadeolu/clique-demos) - Interactive examples
- [Report Issues](https://github.com/kusoroadeolu/clique-themes/issues)

