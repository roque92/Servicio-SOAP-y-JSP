
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BusquedaId_QNAME = new QName("http://WebService/", "busquedaId");
    private final static QName _BusquedaIdResponse_QNAME = new QName("http://WebService/", "busquedaIdResponse");
    private final static QName _Eliminar_QNAME = new QName("http://WebService/", "eliminar");
    private final static QName _EliminarResponse_QNAME = new QName("http://WebService/", "eliminarResponse");
    private final static QName _Insertar_QNAME = new QName("http://WebService/", "insertar");
    private final static QName _InsertarResponse_QNAME = new QName("http://WebService/", "insertarResponse");
    private final static QName _Modificar_QNAME = new QName("http://WebService/", "modificar");
    private final static QName _ModificarResponse_QNAME = new QName("http://WebService/", "modificarResponse");
    private final static QName _Mostrar_QNAME = new QName("http://WebService/", "mostrar");
    private final static QName _MostrarResponse_QNAME = new QName("http://WebService/", "mostrarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusquedaId }
     * 
     */
    public BusquedaId createBusquedaId() {
        return new BusquedaId();
    }

    /**
     * Create an instance of {@link BusquedaIdResponse }
     * 
     */
    public BusquedaIdResponse createBusquedaIdResponse() {
        return new BusquedaIdResponse();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link Insertar }
     * 
     */
    public Insertar createInsertar() {
        return new Insertar();
    }

    /**
     * Create an instance of {@link InsertarResponse }
     * 
     */
    public InsertarResponse createInsertarResponse() {
        return new InsertarResponse();
    }

    /**
     * Create an instance of {@link Modificar }
     * 
     */
    public Modificar createModificar() {
        return new Modificar();
    }

    /**
     * Create an instance of {@link ModificarResponse }
     * 
     */
    public ModificarResponse createModificarResponse() {
        return new ModificarResponse();
    }

    /**
     * Create an instance of {@link Mostrar }
     * 
     */
    public Mostrar createMostrar() {
        return new Mostrar();
    }

    /**
     * Create an instance of {@link MostrarResponse }
     * 
     */
    public MostrarResponse createMostrarResponse() {
        return new MostrarResponse();
    }

    /**
     * Create an instance of {@link DatosVO }
     * 
     */
    public DatosVO createDatosVO() {
        return new DatosVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusquedaId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusquedaId }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "busquedaId")
    public JAXBElement<BusquedaId> createBusquedaId(BusquedaId value) {
        return new JAXBElement<BusquedaId>(_BusquedaId_QNAME, BusquedaId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusquedaIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusquedaIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "busquedaIdResponse")
    public JAXBElement<BusquedaIdResponse> createBusquedaIdResponse(BusquedaIdResponse value) {
        return new JAXBElement<BusquedaIdResponse>(_BusquedaIdResponse_QNAME, BusquedaIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "eliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insertar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Insertar }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "insertar")
    public JAXBElement<Insertar> createInsertar(Insertar value) {
        return new JAXBElement<Insertar>(_Insertar_QNAME, Insertar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "insertarResponse")
    public JAXBElement<InsertarResponse> createInsertarResponse(InsertarResponse value) {
        return new JAXBElement<InsertarResponse>(_InsertarResponse_QNAME, InsertarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modificar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Modificar }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "modificar")
    public JAXBElement<Modificar> createModificar(Modificar value) {
        return new JAXBElement<Modificar>(_Modificar_QNAME, Modificar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "modificarResponse")
    public JAXBElement<ModificarResponse> createModificarResponse(ModificarResponse value) {
        return new JAXBElement<ModificarResponse>(_ModificarResponse_QNAME, ModificarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mostrar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mostrar }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "mostrar")
    public JAXBElement<Mostrar> createMostrar(Mostrar value) {
        return new JAXBElement<Mostrar>(_Mostrar_QNAME, Mostrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MostrarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "mostrarResponse")
    public JAXBElement<MostrarResponse> createMostrarResponse(MostrarResponse value) {
        return new JAXBElement<MostrarResponse>(_MostrarResponse_QNAME, MostrarResponse.class, null, value);
    }

}
