package com.github.kusoroadeolu.cliquethemes;

import com.github.kusoroadeolu.clique.ansi.AnsiCode;
import com.github.kusoroadeolu.clique.themes.CliqueTheme;

import java.util.Map;

public class TokyoNightTheme implements CliqueTheme {

    @Override
    public String themeName() {
        return "tokyo-night";
    }

    @Override
    public Map<String, AnsiCode> styles() {
        return Map.ofEntries(
                // Standard Colors
                Map.entry("tokyo_black", new CustomAnsiCode("\u001B[38;2;65;72;104m")),      // #414868
                Map.entry("tokyo_red", new CustomAnsiCode("\u001B[38;2;247;118;142m")),      // #F7768E
                Map.entry("tokyo_green", new CustomAnsiCode("\u001B[38;2;115;218;202m")),    // #73DACA
                Map.entry("tokyo_yellow", new CustomAnsiCode("\u001B[38;2;224;175;104m")),   // #E0AF68
                Map.entry("tokyo_blue", new CustomAnsiCode("\u001B[38;2;122;162;247m")),     // #7AA2F7
                Map.entry("tokyo_magenta", new CustomAnsiCode("\u001B[38;2;187;154;247m")),  // #BB9AF7
                Map.entry("tokyo_cyan", new CustomAnsiCode("\u001B[38;2;125;207;255m")),     // #7DCFFF
                Map.entry("tokyo_white", new CustomAnsiCode("\u001B[38;2;192;202;245m")),    // #C0CAF5

                // Bright Colors
                Map.entry("*tokyo_black", new CustomAnsiCode("\u001B[38;2;86;95;137m")),     // #565F89
                Map.entry("*tokyo_red", new CustomAnsiCode("\u001B[38;2;247;99;115m")),      // #F76373
                Map.entry("*tokyo_green", new CustomAnsiCode("\u001B[38;2;135;255;236m")),   // #87FFEC
                Map.entry("*tokyo_yellow", new CustomAnsiCode("\u001B[38;2;255;199;118m")),  // #FFC776
                Map.entry("*tokyo_blue", new CustomAnsiCode("\u001B[38;2;68;140;255m")),     // #448CFF
                Map.entry("*tokyo_magenta", new CustomAnsiCode("\u001B[38;2;159;109;255m")), // #9F6DFF
                Map.entry("*tokyo_cyan", new CustomAnsiCode("\u001B[38;2;74;212;255m")),     // #4AD4FF
                Map.entry("*tokyo_white", new CustomAnsiCode("\u001B[38;2;214;222;255m")),   // #D6DEFF

                // Theme-specific colors
                Map.entry("tokyo_bg", new CustomAnsiCode("\u001B[38;2;36;40;59m")),          // #24283B
                Map.entry("tokyo_fg", new CustomAnsiCode("\u001B[38;2;169;177;214m")),       // #A9B1D6

                // Backgrounds - Standard Colors
                Map.entry("bg_tokyo_black", new CustomAnsiCode("\u001B[48;2;65;72;104m")),
                Map.entry("bg_tokyo_red", new CustomAnsiCode("\u001B[48;2;247;118;142m")),
                Map.entry("bg_tokyo_green", new CustomAnsiCode("\u001B[48;2;115;218;202m")),
                Map.entry("bg_tokyo_yellow", new CustomAnsiCode("\u001B[48;2;224;175;104m")),
                Map.entry("bg_tokyo_blue", new CustomAnsiCode("\u001B[48;2;122;162;247m")),
                Map.entry("bg_tokyo_magenta", new CustomAnsiCode("\u001B[48;2;187;154;247m")),
                Map.entry("bg_tokyo_cyan", new CustomAnsiCode("\u001B[48;2;125;207;255m")),
                Map.entry("bg_tokyo_white", new CustomAnsiCode("\u001B[48;2;192;202;245m")),

                // Backgrounds - Bright Colors
                Map.entry("*bg_tokyo_black", new CustomAnsiCode("\u001B[48;2;86;95;137m")),
                Map.entry("*bg_tokyo_red", new CustomAnsiCode("\u001B[48;2;247;99;115m")),
                Map.entry("*bg_tokyo_green", new CustomAnsiCode("\u001B[48;2;135;255;236m")),
                Map.entry("*bg_tokyo_yellow", new CustomAnsiCode("\u001B[48;2;255;199;118m")),
                Map.entry("*bg_tokyo_blue", new CustomAnsiCode("\u001B[48;2;68;140;255m")),
                Map.entry("*bg_tokyo_magenta", new CustomAnsiCode("\u001B[48;2;159;109;255m")),
                Map.entry("*bg_tokyo_cyan", new CustomAnsiCode("\u001B[48;2;74;212;255m")),
                Map.entry("*bg_tokyo_white", new CustomAnsiCode("\u001B[48;2;214;222;255m")),

                // Backgrounds - Theme-specific
                Map.entry("bg_tokyo_bg", new CustomAnsiCode("\u001B[48;2;36;40;59m")),
                Map.entry("bg_tokyo_fg", new CustomAnsiCode("\u001B[48;2;169;177;214m"))
        );
    }

    private record CustomAnsiCode(String code) implements AnsiCode {
        @Override
        public String toString() {
            return code;
        }
    }
}