package io.turntabl.machine;

public class ServerVM extends VirtualMachine {

    private String linuxDistributionName;
    private String majorNumberOfDistribution;
    private String kernelVersion;
    private String serverManagingTeam;

    public ServerVM(String hostname, String requestorName, String linuxDistributionName,
                    String majorNumberOfDistribution, String kernelVersion, String serverManagingTeam) {
        super(hostname, requestorName);
        this.linuxDistributionName = linuxDistributionName;
        this.majorNumberOfDistribution = majorNumberOfDistribution;
        this.kernelVersion = kernelVersion;
        this.serverManagingTeam = serverManagingTeam;
    }

    public String getLinuxDistributionName() {
        return linuxDistributionName;
    }

    public String getMajorNumberOfDistribution() {
        return majorNumberOfDistribution;
    }

    public String getKernelVersion() {
        return kernelVersion;
    }

    public String getServerManagingTeam() {
        return serverManagingTeam;
    }

    @Override
    public long getNumberOfCPU() {
        return this.numberOfCPU;
    }

    @Override
    public void setNumberOfCPU(long numberOfCPU) {
        this.numberOfCPU = numberOfCPU;
    }

    @Override
    public int getSizeOfRAM() {
        return this.sizeOfRAM;
    }

    @Override
    public void setSizeOfRAM(int sizeOfRAM) {
        this.sizeOfRAM = sizeOfRAM;
    }

    @Override
    public int getSizeOfHardDisk() {
        return this.sizeOfHardDisk;
    }

    @Override
    public void setSizeOfHardDisk(int sizeOfHardDisk) {
        this.sizeOfHardDisk = sizeOfHardDisk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServerVM serverVM = (ServerVM) o;

        if (!majorNumberOfDistribution.equals(serverVM.majorNumberOfDistribution)) return false;
        return kernelVersion.equals(serverVM.kernelVersion);
    }

    @Override
    public int hashCode() {
        int result = majorNumberOfDistribution.hashCode();
        result = 31 * result + kernelVersion.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "\nServerVM{" +
                "linuxDistributionName='" + linuxDistributionName + '\'' +
                ", majorNumberOfDistribution='" + majorNumberOfDistribution + '\'' +
                ", kernelVersion='" + kernelVersion + '\'' +
                ", serverManagingTeam='" + serverManagingTeam + '\'' +
                '}';
    }
}
