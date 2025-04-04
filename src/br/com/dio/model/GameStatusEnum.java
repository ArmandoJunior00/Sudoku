package br.com.dio.model;

public enum GameStatusEnum {

    NON_STARTED("Não iniciado"),
    INCOMPLETE("Incompleto"),
    COMPLETE("COmpleto");

    GameStatusEnum(final String label) {
        this.label = label;
    }

    private String label;

    public String getLabel() {
        return label;
    }

    
}
