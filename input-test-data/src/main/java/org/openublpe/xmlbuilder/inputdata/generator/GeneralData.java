package org.openublpe.xmlbuilder.inputdata.generator;

import org.openublpe.xmlbuilder.core.models.catalogs.Catalog6;
import org.openublpe.xmlbuilder.core.models.input.common.ClienteInputModel;
import org.openublpe.xmlbuilder.core.models.input.common.FirmanteInputModel;
import org.openublpe.xmlbuilder.core.models.input.common.ProveedorInputModel;

public class GeneralData {

    private GeneralData() {
        // Just static methods
    }

    public static FirmanteInputModel getFirmante() {
        FirmanteInputModel result = new FirmanteInputModel();
        result.setRuc("11111111111");
        result.setRazonSocial("Firmante");
        return result;
    }

    public static ProveedorInputModel getProveedor() {
        ProveedorInputModel proveedor = new ProveedorInputModel();
        proveedor.setRuc("22222222222");
        proveedor.setRazonSocial("Proveedor");
        proveedor.setCodigoPostal("010101");
        return proveedor;
    }

    public static ClienteInputModel getClienteConRUC() {
        ClienteInputModel cliente = new ClienteInputModel();
        cliente.setNombre("Cliente");
        cliente.setNumeroDocumentoIdentidad("33333333333");
        cliente.setTipoDocumentoIdentidad(Catalog6.RUC.toString());
        return cliente;
    }

    public static ClienteInputModel getClienteConDNI() {
        ClienteInputModel cliente = new ClienteInputModel();
        cliente.setNombre("Cliente");
        cliente.setNumeroDocumentoIdentidad("33333333");
        cliente.setTipoDocumentoIdentidad(Catalog6.DNI.toString());
        return cliente;
    }
}
