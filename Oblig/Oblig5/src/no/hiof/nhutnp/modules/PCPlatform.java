package no.hiof.nhutnp.modules;

public class PCPlatform extends HWConfig {

    public PCPlatform(String name, String producer) {
        super(name, producer);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
