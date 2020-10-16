package kz.kaznu.aiganym.task2;

public enum Sizes {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    Sizes(int euroSize) {
        EuroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

    public String properties() {
        return name() + "(" + EuroSize + ") " + getDescription();
    }

    private int EuroSize;
}
