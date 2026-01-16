package com.github.kusoroadeolu.cliquethemes;

import com.github.kusoroadeolu.clique.ansi.AnsiCode;
import com.github.kusoroadeolu.clique.themes.CliqueTheme;

import java.util.Map;

public class GruvboxDarkPalette implements CliqueTheme {

    @Override
    public String themeName() {
        return "gruvbox-dark";
    }

    @Override
    public Map<String, AnsiCode> styles() {
        return Map.<String, AnsiCode>ofEntries(
                // Primary Colors - Normal
                Map.entry("gruvbox_red", new CustomAnsiCode("\u001B[38;2;204;36;29m")),      // #cc241d
                Map.entry("gruvbox_green", new CustomAnsiCode("\u001B[38;2;152;151;26m")),   // #98971a
                Map.entry("gruvbox_yellow", new CustomAnsiCode("\u001B[38;2;215;153;33m")),  // #d79921
                Map.entry("gruvbox_blue", new CustomAnsiCode("\u001B[38;2;69;133;136m")),    // #458588
                Map.entry("gruvbox_purple", new CustomAnsiCode("\u001B[38;2;177;98;134m")),  // #b16286
                Map.entry("gruvbox_aqua", new CustomAnsiCode("\u001B[38;2;104;157;106m")),   // #689d6a
                Map.entry("gruvbox_gray", new CustomAnsiCode("\u001B[38;2;168;153;132m")),   // #a89984
                Map.entry("gruvbox_orange", new CustomAnsiCode("\u001B[38;2;214;93;14m")),   // #d65d0e

                // Primary Colors - Bright
                Map.entry("*gruvbox_red", new CustomAnsiCode("\u001B[38;2;251;73;52m")),     // #fb4934
                Map.entry("*gruvbox_green", new CustomAnsiCode("\u001B[38;2;184;187;38m")),  // #b8bb26
                Map.entry("*gruvbox_yellow", new CustomAnsiCode("\u001B[38;2;250;189;47m")), // #fabd2f
                Map.entry("*gruvbox_blue", new CustomAnsiCode("\u001B[38;2;131;165;152m")),  // #83a598
                Map.entry("*gruvbox_purple", new CustomAnsiCode("\u001B[38;2;211;134;155m")),// #d3869b
                Map.entry("*gruvbox_aqua", new CustomAnsiCode("\u001B[38;2;142;192;124m")),  // #8ec07c
                Map.entry("*gruvbox_gray", new CustomAnsiCode("\u001B[38;2;146;131;116m")),  // #928374
                Map.entry("*gruvbox_orange", new CustomAnsiCode("\u001B[38;2;254;128;25m")), // #fe8019

                // Background/Foreground
                Map.entry("gruvbox_bg", new CustomAnsiCode("\u001B[38;2;40;40;40m")),        // #282828
                Map.entry("gruvbox_bg0_h", new CustomAnsiCode("\u001B[38;2;29;32;33m")),     // #1d2021
                Map.entry("gruvbox_bg0_s", new CustomAnsiCode("\u001B[38;2;50;48;47m")),     // #32302f
                Map.entry("gruvbox_bg1", new CustomAnsiCode("\u001B[38;2;60;56;54m")),       // #3c3836
                Map.entry("gruvbox_bg2", new CustomAnsiCode("\u001B[38;2;80;73;69m")),       // #504945
                Map.entry("gruvbox_bg3", new CustomAnsiCode("\u001B[38;2;102;92;84m")),      // #665c54
                Map.entry("gruvbox_bg4", new CustomAnsiCode("\u001B[38;2;124;111;100m")),    // #7c6f64

                Map.entry("gruvbox_fg", new CustomAnsiCode("\u001B[38;2;235;219;178m")),     // #ebdbb2
                Map.entry("gruvbox_fg0", new CustomAnsiCode("\u001B[38;2;251;241;199m")),    // #fbf1c7
                Map.entry("gruvbox_fg1", new CustomAnsiCode("\u001B[38;2;235;219;178m")),    // #ebdbb2
                Map.entry("gruvbox_fg2", new CustomAnsiCode("\u001B[38;2;213;196;161m")),    // #d5c4a1
                Map.entry("gruvbox_fg3", new CustomAnsiCode("\u001B[38;2;189;174;147m")),    // #bdae93
                Map.entry("gruvbox_fg4", new CustomAnsiCode("\u001B[38;2;168;153;132m")),    // #a89984

                // Backgrounds - Primary Colors Normal
                Map.entry("bg_gruvbox_red", new CustomAnsiCode("\u001B[48;2;204;36;29m")),
                Map.entry("bg_gruvbox_green", new CustomAnsiCode("\u001B[48;2;152;151;26m")),
                Map.entry("bg_gruvbox_yellow", new CustomAnsiCode("\u001B[48;2;215;153;33m")),
                Map.entry("bg_gruvbox_blue", new CustomAnsiCode("\u001B[48;2;69;133;136m")),
                Map.entry("bg_gruvbox_purple", new CustomAnsiCode("\u001B[48;2;177;98;134m")),
                Map.entry("bg_gruvbox_aqua", new CustomAnsiCode("\u001B[48;2;104;157;106m")),
                Map.entry("bg_gruvbox_gray", new CustomAnsiCode("\u001B[48;2;168;153;132m")),
                Map.entry("bg_gruvbox_orange", new CustomAnsiCode("\u001B[48;2;214;93;14m")),

                // Backgrounds - Primary Colors Bright
                Map.entry("*bg_gruvbox_red", new CustomAnsiCode("\u001B[48;2;251;73;52m")),
                Map.entry("*bg_gruvbox_green", new CustomAnsiCode("\u001B[48;2;184;187;38m")),
                Map.entry("*bg_gruvbox_yellow", new CustomAnsiCode("\u001B[48;2;250;189;47m")),
                Map.entry("*bg_gruvbox_blue", new CustomAnsiCode("\u001B[48;2;131;165;152m")),
                Map.entry("*bg_gruvbox_purple", new CustomAnsiCode("\u001B[48;2;211;134;155m")),
                Map.entry("*bg_gruvbox_aqua", new CustomAnsiCode("\u001B[48;2;142;192;124m")),
                Map.entry("*bg_gruvbox_gray", new CustomAnsiCode("\u001B[48;2;146;131;116m")),
                Map.entry("*bg_gruvbox_orange", new CustomAnsiCode("\u001B[48;2;254;128;25m")),

                // Backgrounds - BG/FG variations
                Map.entry("bg_gruvbox_bg", new CustomAnsiCode("\u001B[48;2;40;40;40m")),
                Map.entry("bg_gruvbox_bg0_h", new CustomAnsiCode("\u001B[48;2;29;32;33m")),
                Map.entry("bg_gruvbox_bg0_s", new CustomAnsiCode("\u001B[48;2;50;48;47m")),
                Map.entry("bg_gruvbox_bg1", new CustomAnsiCode("\u001B[48;2;60;56;54m")),
                Map.entry("bg_gruvbox_bg2", new CustomAnsiCode("\u001B[48;2;80;73;69m")),
                Map.entry("bg_gruvbox_bg3", new CustomAnsiCode("\u001B[48;2;102;92;84m")),
                Map.entry("bg_gruvbox_bg4", new CustomAnsiCode("\u001B[48;2;124;111;100m")),

                Map.entry("bg_gruvbox_fg", new CustomAnsiCode("\u001B[48;2;235;219;178m")),
                Map.entry("bg_gruvbox_fg0", new CustomAnsiCode("\u001B[48;2;251;241;199m")),
                Map.entry("bg_gruvbox_fg1", new CustomAnsiCode("\u001B[48;2;235;219;178m")),
                Map.entry("bg_gruvbox_fg2", new CustomAnsiCode("\u001B[48;2;213;196;161m")),
                Map.entry("bg_gruvbox_fg3", new CustomAnsiCode("\u001B[48;2;189;174;147m")),
                Map.entry("bg_gruvbox_fg4", new CustomAnsiCode("\u001B[48;2;168;153;132m"))
        );
    }

    private record CustomAnsiCode(String code) implements AnsiCode {
        @Override
        public String toString() {
            return code;
        }
    }
}