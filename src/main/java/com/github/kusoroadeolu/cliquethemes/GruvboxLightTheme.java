package com.github.kusoroadeolu.cliquethemes;


import com.github.kusoroadeolu.clique.ansi.AnsiCode;
import com.github.kusoroadeolu.clique.themes.CliqueTheme;

import java.util.Map;

public class GruvboxLightTheme implements CliqueTheme {

    @Override
    public String themeName() {
        return "gruvbox-light";
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
                Map.entry("gruvbox_gray", new CustomAnsiCode("\u001B[38;2;124;111;100m")),   // #7c6f64
                Map.entry("gruvbox_orange", new CustomAnsiCode("\u001B[38;2;214;93;14m")),   // #d65d0e

                // Primary Colors - Bright
                Map.entry("*gruvbox_red", new CustomAnsiCode("\u001B[38;2;157;0;6m")),       // #9d0006
                Map.entry("*gruvbox_green", new CustomAnsiCode("\u001B[38;2;121;116;14m")),  // #79740e
                Map.entry("*gruvbox_yellow", new CustomAnsiCode("\u001B[38;2;181;118;20m")), // #b57614
                Map.entry("*gruvbox_blue", new CustomAnsiCode("\u001B[38;2;7;102;120m")),    // #076678
                Map.entry("*gruvbox_purple", new CustomAnsiCode("\u001B[38;2;143;63;113m")), // #8f3f71
                Map.entry("*gruvbox_aqua", new CustomAnsiCode("\u001B[38;2;66;123;88m")),    // #427b58
                Map.entry("*gruvbox_gray", new CustomAnsiCode("\u001B[38;2;146;131;116m")),  // #928374
                Map.entry("*gruvbox_orange", new CustomAnsiCode("\u001B[38;2;175;58;3m")),   // #af3a03

                // Background/Foreground
                Map.entry("gruvbox_bg", new CustomAnsiCode("\u001B[38;2;251;241;199m")),     // #fbf1c7
                Map.entry("gruvbox_bg0_h", new CustomAnsiCode("\u001B[38;2;249;245;215m")),  // #f9f5d7
                Map.entry("gruvbox_bg0_s", new CustomAnsiCode("\u001B[38;2;242;229;188m")),  // #f2e5bc
                Map.entry("gruvbox_bg1", new CustomAnsiCode("\u001B[38;2;235;219;178m")),    // #ebdbb2
                Map.entry("gruvbox_bg2", new CustomAnsiCode("\u001B[38;2;213;196;161m")),    // #d5c4a1
                Map.entry("gruvbox_bg3", new CustomAnsiCode("\u001B[38;2;189;174;147m")),    // #bdae93
                Map.entry("gruvbox_bg4", new CustomAnsiCode("\u001B[38;2;168;153;132m")),    // #a89984

                Map.entry("gruvbox_fg", new CustomAnsiCode("\u001B[38;2;60;56;54m")),        // #3c3836
                Map.entry("gruvbox_fg0", new CustomAnsiCode("\u001B[38;2;40;40;40m")),       // #282828
                Map.entry("gruvbox_fg1", new CustomAnsiCode("\u001B[38;2;60;56;54m")),       // #3c3836
                Map.entry("gruvbox_fg2", new CustomAnsiCode("\u001B[38;2;80;73;69m")),       // #504945
                Map.entry("gruvbox_fg3", new CustomAnsiCode("\u001B[38;2;102;92;84m")),      // #665c54
                Map.entry("gruvbox_fg4", new CustomAnsiCode("\u001B[38;2;124;111;100m")),    // #7c6f64

                // Backgrounds - Primary Colors Normal
                Map.entry("bg_gruvbox_red", new CustomAnsiCode("\u001B[48;2;204;36;29m")),
                Map.entry("bg_gruvbox_green", new CustomAnsiCode("\u001B[48;2;152;151;26m")),
                Map.entry("bg_gruvbox_yellow", new CustomAnsiCode("\u001B[48;2;215;153;33m")),
                Map.entry("bg_gruvbox_blue", new CustomAnsiCode("\u001B[48;2;69;133;136m")),
                Map.entry("bg_gruvbox_purple", new CustomAnsiCode("\u001B[48;2;177;98;134m")),
                Map.entry("bg_gruvbox_aqua", new CustomAnsiCode("\u001B[48;2;104;157;106m")),
                Map.entry("bg_gruvbox_gray", new CustomAnsiCode("\u001B[48;2;124;111;100m")),
                Map.entry("bg_gruvbox_orange", new CustomAnsiCode("\u001B[48;2;214;93;14m")),

                // Backgrounds - Primary Colors Bright
                Map.entry("*bg_gruvbox_red", new CustomAnsiCode("\u001B[48;2;157;0;6m")),
                Map.entry("*bg_gruvbox_green", new CustomAnsiCode("\u001B[48;2;121;116;14m")),
                Map.entry("*bg_gruvbox_yellow", new CustomAnsiCode("\u001B[48;2;181;118;20m")),
                Map.entry("*bg_gruvbox_blue", new CustomAnsiCode("\u001B[48;2;7;102;120m")),
                Map.entry("*bg_gruvbox_purple", new CustomAnsiCode("\u001B[48;2;143;63;113m")),
                Map.entry("*bg_gruvbox_aqua", new CustomAnsiCode("\u001B[48;2;66;123;88m")),
                Map.entry("*bg_gruvbox_gray", new CustomAnsiCode("\u001B[48;2;146;131;116m")),
                Map.entry("*bg_gruvbox_orange", new CustomAnsiCode("\u001B[48;2;175;58;3m")),

                // Backgrounds - BG/FG variations
                Map.entry("bg_gruvbox_bg", new CustomAnsiCode("\u001B[48;2;251;241;199m")),
                Map.entry("bg_gruvbox_bg0_h", new CustomAnsiCode("\u001B[48;2;249;245;215m")),
                Map.entry("bg_gruvbox_bg0_s", new CustomAnsiCode("\u001B[48;2;242;229;188m")),
                Map.entry("bg_gruvbox_bg1", new CustomAnsiCode("\u001B[48;2;235;219;178m")),
                Map.entry("bg_gruvbox_bg2", new CustomAnsiCode("\u001B[48;2;213;196;161m")),
                Map.entry("bg_gruvbox_bg3", new CustomAnsiCode("\u001B[48;2;189;174;147m")),
                Map.entry("bg_gruvbox_bg4", new CustomAnsiCode("\u001B[48;2;168;153;132m")),

                Map.entry("bg_gruvbox_fg", new CustomAnsiCode("\u001B[48;2;60;56;54m")),
                Map.entry("bg_gruvbox_fg0", new CustomAnsiCode("\u001B[48;2;40;40;40m")),
                Map.entry("bg_gruvbox_fg1", new CustomAnsiCode("\u001B[48;2;60;56;54m")),
                Map.entry("bg_gruvbox_fg2", new CustomAnsiCode("\u001B[48;2;80;73;69m")),
                Map.entry("bg_gruvbox_fg3", new CustomAnsiCode("\u001B[48;2;102;92;84m")),
                Map.entry("bg_gruvbox_fg4", new CustomAnsiCode("\u001B[48;2;124;111;100m"))
        );
    }

    private record CustomAnsiCode(String code) implements AnsiCode {
        @Override
        public String toString() {
            return code;
        }
    }
}