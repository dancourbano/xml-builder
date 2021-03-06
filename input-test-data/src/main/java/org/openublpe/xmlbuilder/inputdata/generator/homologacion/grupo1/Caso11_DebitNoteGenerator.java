package org.openublpe.xmlbuilder.inputdata.generator.homologacion.grupo1;

import org.openublpe.xmlbuilder.core.models.input.standard.invoice.InvoiceInputModel;
import org.openublpe.xmlbuilder.core.models.input.standard.note.debitNote.DebitNoteInputModel;
import org.openublpe.xmlbuilder.inputdata.generator.DebitNoteInputGenerator;

import java.util.Date;

/**
 * Nota de debito de caso 4
 */
public class Caso11_DebitNoteGenerator implements DebitNoteInputGenerator {

    private static volatile DebitNoteInputModel DEBIT_NOTE;

    public static DebitNoteInputModel getInstance() {
        DebitNoteInputModel debitNote = DEBIT_NOTE;
        if (debitNote == null) {
            synchronized (Caso11_DebitNoteGenerator.class) {
                debitNote = DEBIT_NOTE;
                if (debitNote == null) {

                    DEBIT_NOTE = debitNote = new DebitNoteInputModel();

                    debitNote.setSerie("FF11");
                    debitNote.setNumero(3);
                    debitNote.setFechaEmision(new Date().getTime());

                    // Get invoice
                    InvoiceInputModel invoice = Caso4_InvoiceGenerator.getInstance();

                    // Copy
                    debitNote.setFirmante(invoice.getFirmante());
                    debitNote.setProveedor(invoice.getProveedor());
                    debitNote.setCliente(invoice.getCliente());
                    debitNote.setDetalle(invoice.getDetalle());

                    debitNote.setSerieNumeroInvoiceReference(invoice.getSerie() + "-" + invoice.getNumero());
                    debitNote.setDescripcionSustentoInvoiceReference("mi descripcion o sustento");
                }
            }
        }

        return debitNote;
    }

    @Override
    public DebitNoteInputModel getInput() {
        return getInstance();
    }

}
