package mocks;

import classes.IPersoana;

public class StubPersoanaMinora implements IPersoana {
    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return 16;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
