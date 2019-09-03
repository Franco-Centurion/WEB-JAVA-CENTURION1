package Controlador;
import Modelos.Cliente;
import Modelos.ClienteDAO;
import Modelos.Empleado;
import Modelos.EmpleadoDAO;
import Modelos.Producto;
import Modelos.ProductoDAO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {
    
    Empleado em = new Empleado();
    EmpleadoDAO emdao = new EmpleadoDAO();
    Cliente c = new Cliente();
    ClienteDAO cdao = new ClienteDAO();
    Producto p = new Producto();
    ProductoDAO pdao = new ProductoDAO();
    int ide;
    int idc;
    int idp;
    
    /*Venta v = new Venta();
    List<Venta> lista = new ArrayList<>();*/
    int item;
    int cod;
    String descripcion;
    double precio;
    int cant;
    double subtotal;
    double totalPagar;
    
    String numeroserie="";
    /*VentaDAO vdao = new VentaDAO();*/
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("PantallaPrincipal")) {
            request.getRequestDispatcher("PantallaPrincipal.jsp").forward(request, response);
        }
        if (menu.equals("Empleado")) {
            switch (accion) {
                case "Listar":
                    List lista = emdao.listar();
                    request.setAttribute("empleados", lista);
                    break;
                case "Agregar":
                    String dni = request.getParameter("txtDni");
                    String nom = request.getParameter("txtNombres");
                    String user = request.getParameter("txtUser");
                    int tel =Integer.parseInt(request.getParameter("txtTel")) ;
                    em.setDni(dni);
                    em.setNom(nom);
                    em.setUser(user);
                    em.setTel(tel);
                    emdao.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                 case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Empleado e = emdao.listarId(ide);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String dni1 = request.getParameter("txtDni");
                    String nom1 = request.getParameter("txtNombres");
                    String user1 = request.getParameter("txtUser");
                    int tel1 = Integer.parseInt(request.getParameter("txtTel"));
                    em.setDni(dni1);
                    em.setNom(nom1);
                    em.setUser(user1);
                    em.setTel(tel1);
                    em.setId(ide);
                    emdao.actualizar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    emdao.delete(ide);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            
            request.getRequestDispatcher("Empleado.jsp").forward(request, response);
        }
        /*if (menu.equals("Cliente")) {
            switch (accion) {
                case "Listar":
                    List lista = cdao.listar();
                    request.setAttribute("clientes", lista);
                    break;
                case "Agregar":
                    String dni = request.getParameter("txtDni");
                    String nom = request.getParameter("txtNombres");
                    String tel = request.getParameter("txtTel");
                    String est = request.getParameter("txtFecha_alta");
                    c.setDni(dni);
                    c.setNombre(nom);
                    c.setDireccion(tel);
                    c.setFecha_alta(est);
                    cdao.agregar(c);
                    request.getRequestDispatcher("controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idc = Integer.parseInt(request.getParameter("id"));
                    Cliente cl = cdao.listarId(idc);
                    request.setAttribute("cliente", cl);
                    request.getRequestDispatcher("controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String dni1 = request.getParameter("txtDni");
                    String nom1 = request.getParameter("txtNombres");
                    String tel1 = request.getParameter("txtTel");
                   
                    c.setDni(dni1);
                    c.setNombre(nom1);
                    c.setDireccion(tel1);
                    
                    c.setId(idc);
                    cdao.actualizar(c);
                    request.getRequestDispatcher("controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idc = Integer.parseInt(request.getParameter("id"));
                    cdao.delete(idc);
                    request.getRequestDispatcher("controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }*/
        if (menu.equals("Producto")) {
            switch (accion) {
                case "Listar":
                    List lista = pdao.listar();
                    request.setAttribute("productos", lista);
                    break;
                case "Agregar":
                    String dni = request.getParameter("txtDni");
                    double nom = Double.parseDouble(request.getParameter("txtNombres"));
                    int st = Integer.parseInt(request.getParameter("txtTel"));
                    String est = request.getParameter("txtLaboratorio");
                    String tmed = request.getParameter("txtTmedicamento");
                    p.setNom(dni);
                    p.setPrecio(precio);
                    p.setStock(st);
                    p.setLaboratorio(est);
                    pdao.agregar(p);
                    request.getRequestDispatcher("controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idp = Integer.parseInt(request.getParameter("id"));
                    Producto pr = pdao.listarId(idp);
                    request.setAttribute("producto", pr);
                    request.getRequestDispatcher("controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String dni1 = request.getParameter("txtDni");
                    double pre1 = Double.parseDouble(request.getParameter("txtNombres"));
                    int st1 = Integer.parseInt(request.getParameter("txtTel"));
                    String est1 = request.getParameter("txtEstado");
                    p.setNombre(dni1);
                    p.setPrecio(pre1);
                    p.setStock(st1);
                    p.setFecha_vencimiento(est1);
                    p.setId(idp);
                    pdao.actualizar(p);
                    request.getRequestDispatcher("controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idp = Integer.parseInt(request.getParameter("id"));
                    pdao.delete(idp);
                    request.getRequestDispatcher("controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                default:                    
                    throw new AssertionError();
            }
            
            request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }
        /*if (menu.equals("NuevaVenta")) {           
            switch (accion) {
                case "BuscarCliente":
                    String dni = request.getParameter("codigocliente");
                    c.setDni(dni);
                    c = cdao.buscar(dni);
                    request.setAttribute("c", c);
                    request.setAttribute("nserie", numeroserie);
                    break;
                case "BuscarProducto":
                    int id = Integer.parseInt(request.getParameter("codigoproducto"));
                    p = pdao.listarId(id);                    
                    request.setAttribute("c", c);
                    request.setAttribute("producto", p);                    
                    request.setAttribute("lista", lista);                    
                    request.setAttribute("totalpagar", totalPagar);
                    request.setAttribute("nserie", numeroserie);
                    break;
                case "Agregar":
                    request.setAttribute("nserie", numeroserie);
                    request.setAttribute("c", c);
                    totalPagar = 0.0;
                    item = item + 1;
                    cod = p.getId();
                    descripcion = request.getParameter("nomproducto");
                    precio = Double.parseDouble(request.getParameter("precio"));
                    cant = Integer.parseInt(request.getParameter("cant"));
                    subtotal = precio * cant;
                    v = new Venta();
                    v.setItem(item);
                    v.setIdproducto(cod);
                    v.setDescripcionP(descripcion);
                    v.setPrecio(precio);
                    v.setCantidad(cant);
                    v.setSubtotal(subtotal);
                    lista.add(v);
                    for (int i = 0; i < lista.size(); i++) {
                        totalPagar = totalPagar + lista.get(i).getSubtotal();
                    }
                    request.setAttribute("totalpagar", totalPagar);
                    request.setAttribute("lista", lista);                    
                    break;
                case "GenerarVenta":
                    //Actualizacion del Stock
                    for (int i = 0; i < lista.size(); i++) {
                        Producto pr=new Producto();
                        int cantidad=lista.get(i).getCantidad();
                        int idproducto=lista.get(i).getIdproducto();
                        ProductoDAO aO=new ProductoDAO();
                        pr=aO.buscar(idproducto);
                        int sac=pr.getStock()-cantidad;
                        aO.actualizarstock(idproducto, sac);
                    }
                    //Guardar Venta
                    v.setIdcliente(c.getId());
                    v.setIdempleado(2);
                    v.setNumserie(numeroserie);
                    v.setFecha("2019-06-14");
                    v.setMonto(totalPagar);
                    v.setEstado("1");
                    vdao.guardarVenta(v);
                    //Guardar Detalle ventas
                    int idv=Integer.parseInt(vdao.IdVentas());
                    for (int i = 0; i < lista.size(); i++) {
                        v=new Venta();
                        v.setId(idv);
                        v.setIdproducto(lista.get(i).getIdproducto());
                        v.setCantidad(lista.get(i).getCantidad());
                        v.setPrecio(lista.get(i).getPrecio());
                        vdao.guardarDetalleventas(v);
                    }
                    lista=new ArrayList<>();
                    break;
                default:                    
                    v = new Venta();
                    lista = new ArrayList<>();
                    item = 0;
                    totalPagar = 0.0;                    
                    numeroserie = vdao.GenerarSerie();
                    if (numeroserie == null) {
                        numeroserie = "000000001";                        
                        request.setAttribute("nserie", numeroserie);
                    } else {
                        int incrementar = Integer.parseInt(numeroserie);
                        GenerarSerie gs = new GenerarSerie();
                        numeroserie = gs.NumeroSerie(incrementar);
                        request.setAttribute("nserie", numeroserie);
                    }
                    request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
            }
            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
        }
        */
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}