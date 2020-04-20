package org.example.utils;

import org.example.utils.internal.DivHelper;
import org.example.utils.internal.MultHelper;
import org.example.utils.internal.SubHelper;
import org.example.utils.internal.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultHelper multHelper;
    private DivHelper divHelper;

    public Calculadora() {
        this.sumHelper = new SumHelper();
        this.subHelper = new SubHelper();
        this.multHelper = new MultHelper();
        this.divHelper = new DivHelper();
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b) {
        return subHelper.execute(a, b);
    }

    public int mult(int a, int b) {
        return multHelper.execute(a, b);
    }

    public int div(int a, int b) {
        return divHelper.execute(a, b);
    }
}
