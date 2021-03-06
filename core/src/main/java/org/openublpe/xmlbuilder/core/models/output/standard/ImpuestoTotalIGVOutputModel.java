package org.openublpe.xmlbuilder.core.models.output.standard;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ImpuestoTotalIGVOutputModel extends ImpuestoOutputModel {

    @NotNull
    @Min(0)
    private BigDecimal baseImponible;

    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(BigDecimal baseImponible) {
        this.baseImponible = baseImponible;
    }
}
