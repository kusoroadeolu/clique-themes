package com.github.kusoroadeolu.cliquethemes;

import com.github.kusoroadeolu.clique.ansi.AnsiCode;
import com.github.kusoroadeolu.clique.themes.CliqueTheme;

import java.util.Map;

public class CatppuccinLatteTheme implements CliqueTheme {
    @Override
    public String themeName() {
        return "catppuccin-latte";
    }

    @Override
    public Map<String, AnsiCode> styles() {
        return Map.<String, AnsiCode>ofEntries(
                // Base colors
                Map.entry("ctp_rosewater", new CustomAnsiCode("\u001B[38;2;220;138;120m")),  // #dc8a78
                Map.entry("ctp_flamingo", new CustomAnsiCode("\u001B[38;2;221;120;120m")),   // #dd7878
                Map.entry("ctp_pink", new CustomAnsiCode("\u001B[38;2;234;118;203m")),       // #ea76cb
                Map.entry("ctp_mauve", new CustomAnsiCode("\u001B[38;2;136;57;239m")),       // #8839ef
                Map.entry("ctp_red", new CustomAnsiCode("\u001B[38;2;210;15;57m")),          // #d20f39
                Map.entry("ctp_maroon", new CustomAnsiCode("\u001B[38;2;230;69;83m")),       // #e64553
                Map.entry("ctp_peach", new CustomAnsiCode("\u001B[38;2;254;100;11m")),       // #fe640b
                Map.entry("ctp_yellow", new CustomAnsiCode("\u001B[38;2;223;142;29m")),      // #df8e1d
                Map.entry("ctp_green", new CustomAnsiCode("\u001B[38;2;64;160;43m")),        // #40a02b
                Map.entry("ctp_teal", new CustomAnsiCode("\u001B[38;2;23;146;153m")),        // #179299
                Map.entry("ctp_sky", new CustomAnsiCode("\u001B[38;2;4;165;229m")),          // #04a5e5
                Map.entry("ctp_sapphire", new CustomAnsiCode("\u001B[38;2;32;159;181m")),    // #209fb5
                Map.entry("ctp_blue", new CustomAnsiCode("\u001B[38;2;30;102;245m")),        // #1e66f5
                Map.entry("ctp_lavender", new CustomAnsiCode("\u001B[38;2;114;135;253m")),   // #7287fd

                // Surface colors
                Map.entry("ctp_text", new CustomAnsiCode("\u001B[38;2;76;79;105m")),         // #4c4f69
                Map.entry("ctp_subtext1", new CustomAnsiCode("\u001B[38;2;92;95;119m")),     // #5c5f77
                Map.entry("ctp_subtext0", new CustomAnsiCode("\u001B[38;2;108;111;133m")),   // #6c6f85
                Map.entry("ctp_overlay2", new CustomAnsiCode("\u001B[38;2;124;127;147m")),   // #7c7f93
                Map.entry("ctp_overlay1", new CustomAnsiCode("\u001B[38;2;140;143;161m")),   // #8c8fa1
                Map.entry("ctp_overlay0", new CustomAnsiCode("\u001B[38;2;156;160;176m")),   // #9ca0b0
                Map.entry("ctp_surface2", new CustomAnsiCode("\u001B[38;2;172;176;190m")),   // #acb0be
                Map.entry("ctp_surface1", new CustomAnsiCode("\u001B[38;2;188;192;204m")),   // #bcc0cc
                Map.entry("ctp_surface0", new CustomAnsiCode("\u001B[38;2;204;208;218m")),   // #ccd0da
                Map.entry("ctp_base", new CustomAnsiCode("\u001B[38;2;239;241;245m")),       // #eff1f5
                Map.entry("ctp_mantle", new CustomAnsiCode("\u001B[38;2;230;233;239m")),     // #e6e9ef
                Map.entry("ctp_crust", new CustomAnsiCode("\u001B[38;2;220;224;232m")),      // #dce0e8

                // Backgrounds - Base colors
                Map.entry("bg_ctp_rosewater", new CustomAnsiCode("\u001B[48;2;220;138;120m")),
                Map.entry("bg_ctp_flamingo", new CustomAnsiCode("\u001B[48;2;221;120;120m")),
                Map.entry("bg_ctp_pink", new CustomAnsiCode("\u001B[48;2;234;118;203m")),
                Map.entry("bg_ctp_mauve", new CustomAnsiCode("\u001B[48;2;136;57;239m")),
                Map.entry("bg_ctp_red", new CustomAnsiCode("\u001B[48;2;210;15;57m")),
                Map.entry("bg_ctp_maroon", new CustomAnsiCode("\u001B[48;2;230;69;83m")),
                Map.entry("bg_ctp_peach", new CustomAnsiCode("\u001B[48;2;254;100;11m")),
                Map.entry("bg_ctp_yellow", new CustomAnsiCode("\u001B[48;2;223;142;29m")),
                Map.entry("bg_ctp_green", new CustomAnsiCode("\u001B[48;2;64;160;43m")),
                Map.entry("bg_ctp_teal", new CustomAnsiCode("\u001B[48;2;23;146;153m")),
                Map.entry("bg_ctp_sky", new CustomAnsiCode("\u001B[48;2;4;165;229m")),
                Map.entry("bg_ctp_sapphire", new CustomAnsiCode("\u001B[48;2;32;159;181m")),
                Map.entry("bg_ctp_blue", new CustomAnsiCode("\u001B[48;2;30;102;245m")),
                Map.entry("bg_ctp_lavender", new CustomAnsiCode("\u001B[48;2;114;135;253m")),

                // Backgrounds - Surface colors
                Map.entry("bg_ctp_text", new CustomAnsiCode("\u001B[48;2;76;79;105m")),
                Map.entry("bg_ctp_subtext1", new CustomAnsiCode("\u001B[48;2;92;95;119m")),
                Map.entry("bg_ctp_subtext0", new CustomAnsiCode("\u001B[48;2;108;111;133m")),
                Map.entry("bg_ctp_overlay2", new CustomAnsiCode("\u001B[48;2;124;127;147m")),
                Map.entry("bg_ctp_overlay1", new CustomAnsiCode("\u001B[48;2;140;143;161m")),
                Map.entry("bg_ctp_overlay0", new CustomAnsiCode("\u001B[48;2;156;160;176m")),
                Map.entry("bg_ctp_surface2", new CustomAnsiCode("\u001B[48;2;172;176;190m")),
                Map.entry("bg_ctp_surface1", new CustomAnsiCode("\u001B[48;2;188;192;204m")),
                Map.entry("bg_ctp_surface0", new CustomAnsiCode("\u001B[48;2;204;208;218m")),
                Map.entry("bg_ctp_base", new CustomAnsiCode("\u001B[48;2;239;241;245m")),
                Map.entry("bg_ctp_mantle", new CustomAnsiCode("\u001B[48;2;230;233;239m")),
                Map.entry("bg_ctp_crust", new CustomAnsiCode("\u001B[48;2;220;224;232m"))
        );
    }

    private record CustomAnsiCode(String code) implements AnsiCode {
        @Override
        public String toString() {
            return code;
        }
    }
}