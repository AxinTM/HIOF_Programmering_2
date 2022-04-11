package no.hiof.nhutnp.modules;

public class Platform extends HWConfig {

    private String gpu;
    private String cpu;
    private String memory;
    private String storage;

    public Platform(String name, String producer, String gpu, String cpu, String memory, String storage) {
        super(name, producer);
        this.gpu = gpu;
        this.cpu = cpu;
        this.memory = memory;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}
