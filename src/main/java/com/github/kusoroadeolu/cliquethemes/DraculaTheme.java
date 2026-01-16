package com.github.kusoroadeolu.cliquethemes;

import com.github.kusoroadeolu.clique.ansi.AnsiCode;
import com.github.kusoroadeolu.clique.themes.CliqueTheme;

import java.util.Map;

public class DraculaTheme implements CliqueTheme {

    @Override
    public String themeName() {
        return "dracula";
    }

    @Override
    public Map<String, AnsiCode> styles() {
        return Map.ofEntries(
                // Standard
                Map.entry("drac_black", new CustomAnsiCode("\u001B[38;2;33;34;44m")),      // #21222C
                Map.entry("drac_red", new CustomAnsiCode("\u001B[38;2;255;85;85m")),       // #FF5555
                Map.entry("drac_green", new CustomAnsiCode("\u001B[38;2;80;250;123m")),    // #50FA7B
                Map.entry("drac_yellow", new CustomAnsiCode("\u001B[38;2;241;250;140m")),  // #F1FA8C
                Map.entry("drac_blue", new CustomAnsiCode("\u001B[38;2;189;147;249m")),    // #BD93F9
                Map.entry("drac_magenta", new CustomAnsiCode("\u001B[38;2;255;121;198m")), // #FF79C6
                Map.entry("drac_cyan", new CustomAnsiCode("\u001B[38;2;139;233;253m")),    // #8BE9FD
                Map.entry("drac_white", new CustomAnsiCode("\u001B[38;2;248;248;242m")),   // #F8F8F2

                // Bright
                Map.entry("*drac_black", new CustomAnsiCode("\u001B[38;2;98;114;164m")),   // #6272A4
                Map.entry("*drac_red", new CustomAnsiCode("\u001B[38;2;255;110;103m")),    // #FF6E67
                Map.entry("*drac_green", new CustomAnsiCode("\u001B[38;2;105;255;148m")),  // #69FF94
                Map.entry("*drac_yellow", new CustomAnsiCode("\u001B[38;2;255;255;165m")), // #FFFFA5
                Map.entry("*drac_blue", new CustomAnsiCode("\u001B[38;2;209;154;255m")),   // #D19AFF
                Map.entry("*drac_magenta", new CustomAnsiCode("\u001B[38;2;255;146;208m")),// #FF92D0
                Map.entry("*drac_cyan", new CustomAnsiCode("\u001B[38;2;154;237;254m")),   // #9AEDFE
                Map.entry("*drac_white", new CustomAnsiCode("\u001B[38;2;255;255;255m")),  // #FFFFFF

                // Background
                Map.entry("bg_drac_black", new CustomAnsiCode("\u001B[48;2;33;34;44m")),
                Map.entry("bg_drac_red", new CustomAnsiCode("\u001B[48;2;255;85;85m")),
                Map.entry("bg_drac_green", new CustomAnsiCode("\u001B[48;2;80;250;123m")),
                Map.entry("bg_drac_yellow", new CustomAnsiCode("\u001B[48;2;241;250;140m")),
                Map.entry("bg_drac_blue", new CustomAnsiCode("\u001B[48;2;189;147;249m")),
                Map.entry("bg_drac_magenta", new CustomAnsiCode("\u001B[48;2;255;121;198m")),
                Map.entry("bg_drac_cyan", new CustomAnsiCode("\u001B[48;2;139;233;253m")),
                Map.entry("bg_drac_white", new CustomAnsiCode("\u001B[48;2;248;248;242m")),

                // Bright backgrounds
                Map.entry("*bg_drac_black", new CustomAnsiCode("\u001B[48;2;98;114;164m")),
                Map.entry("*bg_drac_red", new CustomAnsiCode("\u001B[48;2;255;110;103m")),
                Map.entry("*bg_drac_green", new CustomAnsiCode("\u001B[48;2;105;255;148m")),
                Map.entry("*bg_drac_yellow", new CustomAnsiCode("\u001B[48;2;255;255;165m")),
                Map.entry("*bg_drac_blue", new CustomAnsiCode("\u001B[48;2;209;154;255m")),
                Map.entry("*bg_drac_magenta", new CustomAnsiCode("\u001B[48;2;255;146;208m")),
                Map.entry("*bg_drac_cyan", new CustomAnsiCode("\u001B[48;2;154;237;254m")),
                Map.entry("*bg_drac_white", new CustomAnsiCode("\u001B[48;2;255;255;255m"))
        );
    }

    private record CustomAnsiCode(String code) implements AnsiCode {
        @Override
        public String toString() {
            return code;
        }
    }
}