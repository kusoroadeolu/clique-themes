package com.github.kusoroadeolu.cliquethemes;

import com.github.kusoroadeolu.clique.ansi.AnsiCode;
import com.github.kusoroadeolu.clique.themes.CliqueTheme;

import java.util.Map;

public class NordTheme implements CliqueTheme {

    @Override
    public String themeName() {
        return "nord";
    }

    @Override
    public Map<String, AnsiCode> styles() {
        return Map.ofEntries(
                // Polar Night (dark backgrounds)
                Map.entry("nord_polar0", new CustomAnsiCode("\u001B[38;2;46;52;64m")),     // #2E3440
                Map.entry("nord_polar1", new CustomAnsiCode("\u001B[38;2;59;66;82m")),     // #3B4252
                Map.entry("nord_polar2", new CustomAnsiCode("\u001B[38;2;67;76;94m")),     // #434C5E
                Map.entry("nord_polar3", new CustomAnsiCode("\u001B[38;2;76;86;106m")),    // #4C566A

                // Snow Storm
                Map.entry("nord_snow", new CustomAnsiCode("\u001B[38;2;216;222;233m")),   // #D8DEE9


                // Frost (blues/cyans)
                Map.entry("nord_frost0", new CustomAnsiCode("\u001B[38;2;143;188;187m")),  // #8FBCBB
                Map.entry("nord_frost1", new CustomAnsiCode("\u001B[38;2;136;192;208m")),  // #88C0D0
                Map.entry("nord_frost2", new CustomAnsiCode("\u001B[38;2;129;161;193m")),  // #81A1C1
                Map.entry("nord_frost3", new CustomAnsiCode("\u001B[38;2;94;129;172m")),   // #5E81AC

                // Aurora (accent colors)
                Map.entry("nord_red", new CustomAnsiCode("\u001B[38;2;191;97;106m")),      // #BF616A
                Map.entry("nord_orange", new CustomAnsiCode("\u001B[38;2;208;135;112m")),  // #D08770
                Map.entry("nord_yellow", new CustomAnsiCode("\u001B[38;2;235;203;139m")),  // #EBCB8B
                Map.entry("nord_green", new CustomAnsiCode("\u001B[38;2;163;190;140m")),   // #A3BE8C
                Map.entry("nord_purple", new CustomAnsiCode("\u001B[38;2;180;142;173m")),  // #B48EAD

                // Backgrounds - Polar Night
                Map.entry("bg_nord_polar0", new CustomAnsiCode("\u001B[48;2;46;52;64m")),
                Map.entry("bg_nord_polar1", new CustomAnsiCode("\u001B[48;2;59;66;82m")),
                Map.entry("bg_nord_polar2", new CustomAnsiCode("\u001B[48;2;67;76;94m")),
                Map.entry("bg_nord_polar3", new CustomAnsiCode("\u001B[48;2;76;86;106m")),

                // Backgrounds - Snow Storm
                Map.entry("bg_nord_snow0", new CustomAnsiCode("\u001B[48;2;216;222;233m")),
                Map.entry("bg_nord_snow1", new CustomAnsiCode("\u001B[48;2;229;233;240m")),
                Map.entry("bg_nord_snow2", new CustomAnsiCode("\u001B[48;2;236;239;244m")),

                // Backgrounds - Frost
                Map.entry("bg_nord_frost0", new CustomAnsiCode("\u001B[48;2;143;188;187m")),
                Map.entry("bg_nord_frost1", new CustomAnsiCode("\u001B[48;2;136;192;208m")),
                Map.entry("bg_nord_frost2", new CustomAnsiCode("\u001B[48;2;129;161;193m")),
                Map.entry("bg_nord_frost3", new CustomAnsiCode("\u001B[48;2;94;129;172m")),

                // Backgrounds - Aurora
                Map.entry("bg_nord_red", new CustomAnsiCode("\u001B[48;2;191;97;106m")),
                Map.entry("bg_nord_orange", new CustomAnsiCode("\u001B[48;2;208;135;112m")),
                Map.entry("bg_nord_yellow", new CustomAnsiCode("\u001B[48;2;235;203;139m")),
                Map.entry("bg_nord_green", new CustomAnsiCode("\u001B[48;2;163;190;140m")),
                Map.entry("bg_nord_purple", new CustomAnsiCode("\u001B[48;2;180;142;173m"))
        );
    }

    private record CustomAnsiCode(String code) implements AnsiCode {
        @Override
        public String toString() {
            return code;
        }
    }
}