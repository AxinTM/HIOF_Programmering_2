package no.hiof.nhutnp;

import no.hiof.nhutnp.forms.PGGUI;
import no.hiof.nhutnp.modules.PCPlatform;
import no.hiof.nhutnp.modules.Platform;

public class Main {
    public static void main(String[] args) {

      /*  Platform ps1 = new Platform("PS1", "Sony", "CXD8514Q", "MIPS R3000A","EDO DRAM 2MB", "Memory Card 1MB");
        Platform ps2 = new Platform("PS2", "Sony", "GS-250nm", "MIPS R5900","RDRAM 32MB", "40GB HDD");
        Platform ps3 = new Platform("PS3", "Sony", "RSX-65nm", "PowerPC-base Core","XDR 256MB", "250GB HDD");
        Platform ps4 = new Platform("PS4", "Sony", "AMD Radeon", "AMD Jaguar","GDDR5 8GB", "500GB HDD");
        Platform ps4Pro = new Platform("PS4PRO", "Sony", "AMD Radeon", "AMD Jaguar","GDDR5 8GB", "1TB HDD");
        Platform ps5 = new Platform("PS5", "Sony", "AMD Radeon RDNA 2", "AMD Zen 2","GDDR6 16GB", "825GB SSD");

        Platform xbox = new Platform("XBOX", "Microsoft", "NV2A ASIC", "Intel Pentium III","DDR SDRAM 64MB", "8GB HDD");
        Platform xbox360 = new Platform("XBOX360", "Microsoft", "ATI Xenos", "XCPU","GDDR3 512MB", "60GB SSD");
        Platform xboxOne = new Platform("XBOX One", "Microsoft", "AMD Radeon GCN", "AMD custom CPU","GDDR3 8GB", "500GB SSD");
        Platform xboxSerieX = new Platform("XBOX Serie X", "Microsoft", "AMD Radeon RDNA 2", "AMD Zen 2","GDDR6 16GB", "1TB SSD");

        Platform nes = new Platform("Nintendo Entertainment System", "Nintendo", "Picture Processing Unit", " Ricoh 2A03","OnBoard RAM 2KB", "ROM cartridge");
        Platform snes = new Platform("Super Nintendo Entertainment System", "Nintendo", "Picture Processing Unit", "Ricoh 5A22","RAM 128KB", "ROM cartridge");
        Platform n64 = new Platform("Nintendo 64", "Nintendo", " Reality Coprocessor", "MIPS R4300i","Rambus RDRAM 4MB", "Controller Pak");
        Platform nGameCube= new Platform("Nintendo GameCube", "Nintendo", "ATI Flipper ASIC", "PowerPC Gekko","RAM 64MB", "Memory Card 8MB");
        Platform nWii = new Platform("Wii", "Nintendo", "ATI Hollywood", "IBM PowerPC Broadway","GDDR3 SDRAM 64MB", "512MB HDD");
        Platform nWiiU = new Platform("Wii U", "Nintendo", "AMD Radeon-based Latte", "IBM PowerPC Espresso", "DDR3 2GB", "Internal flash memory 8 GB");
        Platform nSwitch = new Platform("Nintendo Switch", "Nintendo", "Nvidea Maxwell-based CUDA", "ARM 4 Cortex-A57"," LPDDR4 4GB", "eMMC 32GB");

        PCPlatform pc = new PCPlatform("Self build", "Various");
        PCPlatform KomplettA245 = new PCPlatform("Komplett a245 Epic Gaming PC", "Komplett");

       */

        PGGUI pg= new PGGUI("PG");
        pg.setVisible(true);
        pg.setBounds(600,200,750,500);
    }
}
