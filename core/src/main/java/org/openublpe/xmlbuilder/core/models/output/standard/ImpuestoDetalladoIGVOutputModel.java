package org.openublpe.xmlbuilder.core.models.output.standard;

import org.openublpe.xmlbuilder.core.models.catalogs.Catalog7;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ImpuestoDetalladoIGVOutputModel extends ImpuestoOutputModel {

    @NotNull
    @Min(0)
    private BigDecimal baseImponible;

    @NotNull
    private Catalog7 tipo;

    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(BigDecimal baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Catalog7 getTipo() {
        return tipo;
    }

    public void setTipo(Catalog7 tipo) {
        this.tipo = tipo;
    }

}
