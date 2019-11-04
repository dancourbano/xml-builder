package org.openublpe.xmlbuilder;

import org.openublpe.xmlbuilder.models.input.general.DetalleInputModel;
import org.openublpe.xmlbuilder.models.input.general.note.creditNote.CreditNoteInputModel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SimpleCreditNoteInputGenerator implements CreditNoteInputGenerator {
    @Override
    public CreditNoteInputModel getCreditNote() {
        CreditNoteInputModel input = new CreditNoteInputModel();

        input.setSerie("F001");
        input.setNumero(123);
        input.setFechaEmision(new Date().getTime());

        input.setFirmante(FirmanteInputGenerator.getFirmante());

        input.setProveedor(ProveedorInputGenerator.getProveedor());
        input.setCliente(ClienteInputGenerator.getCliente());


        List<DetalleInputModel> detalle = new ArrayList<>();
        input.setDetalle(detalle);

        //
        DetalleInputModel item1 = new DetalleInputModel();
        detalle.add(item1);
        item1.setDescripcion("Item1");
        item1.setCantidad(BigDecimal.ONE);
        item1.setPrecioUnitario(BigDecimal.TEN);

        DetalleInputModel item2 = new DetalleInputModel();
        detalle.add(item2);
        item2.setDescripcion("item2");
        item2.setCantidad(BigDecimal.TEN);
        item2.setPrecioUnitario(BigDecimal.ONE);


        input.setSerieNumeroInvoiceReference("F009-9");
        input.setDescripcionSustentoInvoiceReference("El cliente lo rechazó");
        return input;
    }
}
