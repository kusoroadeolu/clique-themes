package com.github.kusoroadeolu.cliquethemes;

import com.github.kusoroadeolu.clique.ansi.AnsiCode;
import com.github.kusoroadeolu.clique.themes.CliqueTheme;

import java.util.Map;

public class CatppuccinMochaTheme implements CliqueTheme {

    @Override
    public String themeName() {
        return "catppuccin-mocha";
    }

    @Override
    public Map<String, AnsiCode> styles() {
        return Map.<String, AnsiCode>ofEntries(
                // Base colors
                Map.entry("ctp_rosewater", new CustomAnsiCode("\u001B[38;2;245;224;220m")),  // #f5e0dc
                Map.entry("ctp_flamingo", new CustomAnsiCode("\u001B[38;2;242;205;205m")),   // #f2cdcd
                Map.entry("ctp_pink", new CustomAnsiCode("\u001B[38;2;245;194;231m")),       // #f5c2e7
                Map.entry("ctp_mauve", new CustomAnsiCode("\u001B[38;2;203;166;247m")),      // #cba6f7
                Map.entry("ctp_red", new CustomAnsiCode("\u001B[38;2;243;139;168m")),        // #f38ba8
                Map.entry("ctp_maroon", new CustomAnsiCode("\u001B[38;2;235;160;172m")),     // #eba0ac
                Map.entry("ctp_peach", new CustomAnsiCode("\u001B[38;2;250;179;135m")),      // #fab387
                Map.entry("ctp_yellow", new CustomAnsiCode("\u001B[38;2;249;226;175m")),     // #f9e2af
                Map.entry("ctp_green", new CustomAnsiCode("\u001B[38;2;166;227;161m")),      // #a6e3a1
                Map.entry("ctp_teal", new CustomAnsiCode("\u001B[38;2;148;226;213m")),       // #94e2d5
                Map.entry("ctp_sky", new CustomAnsiCode("\u001B[38;2;137;220;235m")),        // #89dceb
                Map.entry("ctp_sapphire", new CustomAnsiCode("\u001B[38;2;116;199;236m")),   // #74c7ec
                Map.entry("ctp_blue", new CustomAnsiCode("\u001B[38;2;137;180;250m")),       // #89b4fa
                Map.entry("ctp_lavender", new CustomAnsiCode("\u001B[38;2;180;190;254m")),   // #b4befe

                // Surface colors
                Map.entry("ctp_text", new CustomAnsiCode("\u001B[38;2;205;214;244m")),       // #cdd6f4
                Map.entry("ctp_subtext1", new CustomAnsiCode("\u001B[38;2;186;194;222m")),   // #bac2de
                Map.entry("ctp_subtext0", new CustomAnsiCode("\u001B[38;2;166;173;200m")),   // #a6adc8
                Map.entry("ctp_overlay2", new CustomAnsiCode("\u001B[38;2;147;153;178m")),   // #9399b2
                Map.entry("ctp_overlay1", new CustomAnsiCode("\u001B[38;2;127;132;156m")),   // #7f849c
                Map.entry("ctp_overlay0", new CustomAnsiCode("\u001B[38;2;108;112;134m")),   // #6c7086
                Map.entry("ctp_surface2", new CustomAnsiCode("\u001B[38;2;88;91;112m")),     // #585b70
                Map.entry("ctp_surface1", new CustomAnsiCode("\u001B[38;2;69;71;90m")),      // #45475a
                Map.entry("ctp_surface0", new CustomAnsiCode("\u001B[38;2;49;50;68m")),      // #313244
                Map.entry("ctp_base", new CustomAnsiCode("\u001B[38;2;30;30;46m")),          // #1e1e2e
                Map.entry("ctp_mantle", new CustomAnsiCode("\u001B[38;2;24;24;37m")),        // #181825
                Map.entry("ctp_crust", new CustomAnsiCode("\u001B[38;2;17;17;27m")),         // #11111b

                // Backgrounds - Base colors
                Map.entry("bg_ctp_rosewater", new CustomAnsiCode("\u001B[48;2;245;224;220m")),
                Map.entry("bg_ctp_flamingo", new CustomAnsiCode("\u001B[48;2;242;205;205m")),
                Map.entry("bg_ctp_pink", new CustomAnsiCode("\u001B[48;2;245;194;231m")),
                Map.entry("bg_ctp_mauve", new CustomAnsiCode("\u001B[48;2;203;166;247m")),
                Map.entry("bg_ctp_red", new CustomAnsiCode("\u001B[48;2;243;139;168m")),
                Map.entry("bg_ctp_maroon", new CustomAnsiCode("\u001B[48;2;235;160;172m")),
                Map.entry("bg_ctp_peach", new CustomAnsiCode("\u001B[48;2;250;179;135m")),
                Map.entry("bg_ctp_yellow", new CustomAnsiCode("\u001B[48;2;249;226;175m")),
                Map.entry("bg_ctp_green", new CustomAnsiCode("\u001B[48;2;166;227;161m")),
                Map.entry("bg_ctp_teal", new CustomAnsiCode("\u001B[48;2;148;226;213m")),
                Map.entry("bg_ctp_sky", new CustomAnsiCode("\u001B[48;2;137;220;235m")),
                Map.entry("bg_ctp_sapphire", new CustomAnsiCode("\u001B[48;2;116;199;236m")),
                Map.entry("bg_ctp_blue", new CustomAnsiCode("\u001B[48;2;137;180;250m")),
                Map.entry("bg_ctp_lavender", new CustomAnsiCode("\u001B[48;2;180;190;254m")),

                // Backgrounds - Surface colors
                Map.entry("bg_ctp_text", new CustomAnsiCode("\u001B[48;2;205;214;244m")),
                Map.entry("bg_ctp_subtext1", new CustomAnsiCode("\u001B[48;2;186;194;222m")),
                Map.entry("bg_ctp_subtext0", new CustomAnsiCode("\u001B[48;2;166;173;200m")),
                Map.entry("bg_ctp_overlay2", new CustomAnsiCode("\u001B[48;2;147;153;178m")),
                Map.entry("bg_ctp_overlay1", new CustomAnsiCode("\u001B[48;2;127;132;156m")),
                Map.entry("bg_ctp_overlay0", new CustomAnsiCode("\u001B[48;2;108;112;134m")),
                Map.entry("bg_ctp_surface2", new CustomAnsiCode("\u001B[48;2;88;91;112m")),
                Map.entry("bg_ctp_surface1", new CustomAnsiCode("\u001B[48;2;69;71;90m")),
                Map.entry("bg_ctp_surface0", new CustomAnsiCode("\u001B[48;2;49;50;68m")),
                Map.entry("bg_ctp_base", new CustomAnsiCode("\u001B[48;2;30;30;46m")),
                Map.entry("bg_ctp_mantle", new CustomAnsiCode("\u001B[48;2;24;24;37m")),
                Map.entry("bg_ctp_crust", new CustomAnsiCode("\u001B[48;2;17;17;27m"))
        );
    }

    private record CustomAnsiCode(String code) implements AnsiCode {
        @Override
        public String toString() {
            return code;
        }
    }
}