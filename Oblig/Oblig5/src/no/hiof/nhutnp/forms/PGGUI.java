package no.hiof.nhutnp.forms;

import no.hiof.nhutnp.modules.Game;
import no.hiof.nhutnp.modules.HWConfig;
import no.hiof.nhutnp.modules.PCPlatform;
import no.hiof.nhutnp.modules.Platform;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PGGUI extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JPanel gamePanel;
    private JList<HWConfig> platformList;
    private JLabel labelName;
    private JLabel labelStorage;
    private JLabel labelMemory;
    private JLabel labelGPU;
    private JLabel labelCPU;
    private JLabel labelProducer;
    private JList<Game> gameList;
    private JLabel gameName;
    private JLabel gamePlatform;
    private JLabel gameGenre;
    private JLabel gameDev;
    private JLabel gamePub;
    private JButton addGameButton;
    private JTextField addGameName;
    private JTextField addGamePlatform;
    private JTextField addGameGenre;
    private JTextField addGameDeveloper;
    private JTextField addGamePublisher;


    public PGGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        platformList.setModel(platformModel);
        gameList.setModel(gameModel);


        platformList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                HWConfig currentInfo = platformList.getSelectedValue();
                if (currentInfo instanceof Platform platform) {
                    labelName.setText("Name: " + platform.getName());
                    labelCPU.setText("CPU: " + platform.getCpu());
                    labelGPU.setText("GPU: " + platform.getGpu());
                    labelStorage.setText("Storage: " + platform.getStorage());
                    labelMemory.setText("Memory: " + platform.getMemory());
                    labelProducer.setText("Producer: " + platform.getProducer());
                } else if (currentInfo instanceof PCPlatform pcPlatform) {
                    labelName.setText("Name: " + pcPlatform.getName());
                    labelProducer.setText("Producer: " + pcPlatform.getProducer());
                    labelCPU.setText("CPU: ");
                    labelGPU.setText("GPU: ");
                    labelStorage.setText("Storage: ");
                    labelMemory.setText("Memory: ");
                }
            }
        });
        platformModel.addElement(ps1);
        platformModel.addElement(ps2);
        platformModel.addElement(ps3);
        platformModel.addElement(ps4);
        platformModel.addElement(ps4Pro);
        platformModel.addElement(ps5);
        platformModel.addElement(xbox);
        platformModel.addElement(xbox360);
        platformModel.addElement(xboxOne);
        platformModel.addElement(xboxSerieX);
        platformModel.addElement(nes);
        platformModel.addElement(snes);
        platformModel.addElement(n64);
        platformModel.addElement(nGameCube);
        platformModel.addElement(nWii);
        platformModel.addElement(nWiiU);
        platformModel.addElement(nSwitch);
        platformModel.addElement(komplettA245);
        platformModel.addElement(pc);
    }

    private DefaultListModel<HWConfig> platformModel = new DefaultListModel<>();
    private DefaultListModel<Game> gameModel = new DefaultListModel<>();

    Platform ps1 = new Platform("PS1", "Sony", "CXD8514Q", "MIPS R3000A", "EDO DRAM 2MB", "Memory Card 1MB");
    Platform ps2 = new Platform("PS2", "Sony", "GS-250nm", "MIPS R5900", "RDRAM 32MB", "40GB HDD");
    Platform ps3 = new Platform("PS3", "Sony", "RSX-65nm", "PowerPC-base Core", "XDR 256MB", "250GB HDD");
    Platform ps4 = new Platform("PS4", "Sony", "AMD Radeon", "AMD Jaguar", "GDDR5 8GB", "500GB HDD");
    Platform ps4Pro = new Platform("PS4PRO", "Sony", "AMD Radeon", "AMD Jaguar", "GDDR5 8GB", "1TB HDD");
    Platform ps5 = new Platform("PS5", "Sony", "AMD Radeon RDNA 2", "AMD Zen 2", "GDDR6 16GB", "825GB SSD");

    Platform xbox = new Platform("XBOX", "Microsoft", "NV2A ASIC", "Intel Pentium III", "DDR SDRAM 64MB", "8GB HDD");
    Platform xbox360 = new Platform("XBOX360", "Microsoft", "ATI Xenos", "XCPU", "GDDR3 512MB", "60GB SSD");
    Platform xboxOne = new Platform("XBOX One", "Microsoft", "AMD Radeon GCN", "AMD custom CPU", "GDDR3 8GB", "500GB SSD");
    Platform xboxSerieX = new Platform("XBOX Serie X", "Microsoft", "AMD Radeon RDNA 2", "AMD Zen 2", "GDDR6 16GB", "1TB SSD");

    Platform nes = new Platform("Nintendo Entertainment System", "Nintendo", "Picture Processing Unit", " Ricoh 2A03", "OnBoard RAM 2KB", "ROM cartridge");
    Platform snes = new Platform("Super Nintendo Entertainment System", "Nintendo", "Picture Processing Unit", "Ricoh 5A22", "RAM 128KB", "ROM cartridge");
    Platform n64 = new Platform("Nintendo 64", "Nintendo", " Reality Coprocessor", "MIPS R4300i", "Rambus RDRAM 4MB", "Controller Pak");
    Platform nGameCube = new Platform("Nintendo GameCube", "Nintendo", "ATI Flipper ASIC", "PowerPC Gekko", "RAM 64MB", "Memory Card 8MB");
    Platform nWii = new Platform("Wii", "Nintendo", "ATI Hollywood", "IBM PowerPC Broadway", "GDDR3 SDRAM 64MB", "512MB HDD");
    Platform nWiiU = new Platform("Wii U", "Nintendo", "AMD Radeon-based Latte", "IBM PowerPC Espresso", "DDR3 2GB", "Internal flash memory 8 GB");
    Platform nSwitch = new Platform("Nintendo Switch", "Nintendo", "Nvidea Maxwell-based CUDA", "ARM 4 Cortex-A57", " LPDDR4 4GB", "eMMC 32GB");

    PCPlatform komplettA245 = new PCPlatform("Komplett a245 Epic Gaming PC", "Komplett");
    PCPlatform pc = new PCPlatform("Self build", "Various");

}
