package Enums;

public enum Size {
    XXS(32, "Детский размер"),
    XS(34,"Взрослый размер"),
    S(36,"Взрослый размер"),
    M(38,"Взрослый размер"),
    L(40,"Взрослый размер");
    private int euroSize;
    private String description;
    Size(int euroSize, String description) {
        this.euroSize = euroSize;
    }
    public String getDescription(){
        return description;
    }
}
