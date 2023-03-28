package builder.model;

public interface Builder {
    public Pacient build();

    public Builder setNume(String nume);

    public Builder setPatRabatabil(boolean patRabatabil);

    public Builder setMicDejunsInclus(boolean micDejunsInclus);

    public Builder setPapuciDeCamera(boolean papuciDeCamera);
    public Builder setHalatPentruInterior(boolean halatPentruInterior);

}
