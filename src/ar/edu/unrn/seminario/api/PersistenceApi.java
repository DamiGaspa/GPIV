package ar.edu.unrn.seminario.api;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import ar.edu.unrn.seminario.exception.DataBaseException;
import ar.edu.unrn.seminario.exception.DataEmptyException;
import ar.edu.unrn.seminario.exception.DataExistException;
import ar.edu.unrn.seminario.exception.InvalidInputException;

public class PersistenceApi implements Api {

//	MarcaDAO marcaDAO;
//	StockDAO stockDAO;
//	TipoPrendaDAO tipoDAO;
//	TalleDAO talleDAO;
//	ProveedorDAO proveedorDAO;
//	ProductoDAO productoDAO;
//	ProductoVentaDAO productoventaDAO;
//	VentaDAO ventaDAO;
//	ItemCarritoDAO itemCarritoDAO;
//	CarritoDAO carritoDAO;
//
//	static ResourceBundle labels;
//
//	public PersistenceApi() {
//		marcaDAO = new MarcaDAOJDBC();
//		stockDAO = new StockDAOJDBC();
//		tipoDAO = new TipoPrendaDAOJDBC();
//		talleDAO = new TalleDAOJDBC();
//		proveedorDAO = new ProveedorDAOJDBC();
//		productoDAO = new ProductoDAOJDBC();
//		productoventaDAO = new ProductoVentaDAOJDBC();
//		ventaDAO = new VentaDAOJDBC();
//		itemCarritoDAO = new ItemCarritoDAOJDBC();
//		carritoDAO = new CarritoDAOJDBC();
//	}
//
//	@Override
//	public void altaProducto(String codigo, int marca, int tipo, int talle, double precio, int proveedor, int cantidad)
//			throws DataEmptyException, DataExistException, DataBaseException {
//		Producto nuevoProducto = new Producto(codigo, marcaDAO.find(marca), tipoDAO.find(tipo), talleDAO.find(talle),
//				precio, proveedorDAO.find(proveedor));
//		Stock nuevoStock = new Stock(nuevoProducto, cantidad, LocalDate.now());
//		stockDAO.create(nuevoStock);
//	}
//
//	@Override
//	public void bajaProducto(String codigo) throws DataBaseException {
//		productoDAO.remove(codigo);
//
//	}
//
//	@Override
//	public void modificarStock(String codigo, int marca, int tipo, int talle, double precio, int proveedor,
//			int cantidad) throws DataEmptyException, DataExistException, DataBaseException {
//		Producto producto = new Producto(
//			codigo,
//			marcaDAO.find(marca),
//			tipoDAO.find(tipo),
//			talleDAO.find(talle),
//			precio,
//			proveedorDAO.find(proveedor));
//		Stock stock = new Stock(producto, Integer.valueOf(cantidad), LocalDate.now());
//		stockDAO.update(stock);
//	}
//
//	@Override
//	public void altaTalle(String nombre) throws DataEmptyException, DataExistException, DataBaseException {
//		talleDAO.create(new Talle(nombre));
//
//	}
//
//	@Override
//	public void bajaTalle(String nombre) throws DataBaseException, DataEmptyException {
//		talleDAO.remove(nombre);
//
//	}
//
//	@Override
//	public void modificarTalle(int id, String nombre_nuevo)
//			throws DataBaseException, DataEmptyException, DataExistException {
//		Talle talle = new Talle(id, nombre_nuevo);
//		talleDAO.update(talle);
//
//	}
//
//	@Override
//	public void altaPrenda(String nombre) throws DataBaseException, DataExistException, DataEmptyException {
//		tipoDAO.create(new TipoPrenda(nombre));
//	}
//
//	@Override
//	public void bajaPrenda(String nombre) throws DataBaseException, DataEmptyException {
//		tipoDAO.remove(new TipoPrenda(nombre));
//	}
//
//	@Override
//	public void modificarPrenda(int id, String nombre_nuevo)
//			throws DataBaseException, DataEmptyException, DataExistException {
//		TipoPrenda tp = new TipoPrenda(id, nombre_nuevo);
//		tipoDAO.update(tp);
//
//	}
//
//	@Override
//	public void altaMarca(String marca) throws DataEmptyException, DataExistException, DataBaseException {
//		marcaDAO.create(new Marca(marca));
//
//	}
//
//	@Override
//	public void bajaMarca(String nombre) throws DataBaseException, DataEmptyException {
//		marcaDAO.remove(new Marca(nombre));
//
//	}
//
//	@Override
//	public void modificarMarca(int id, String nombre_nuevo)
//			throws DataBaseException, DataEmptyException, DataExistException {
//		Marca marca = new Marca(id, nombre_nuevo);
//		marcaDAO.update(marca);
//
//	}
//
//	@Override
//	public void altaProveedor(String denominacion, String telefono, String mail, String direccion)
//			throws DataEmptyException, DataExistException, InvalidInputException, DataBaseException {
//		proveedorDAO.create(new Proveedor(denominacion, telefono, mail, direccion));
//
//	}
//
//	@Override
//	public void bajaProveedor(String denominacion) throws DataBaseException {
//		proveedorDAO.remove(denominacion);
//
//	}
//
//	@Override
//	public void modificarProveedor(int id, String denominacion, String telefono, String email, String direccion)
//			throws DataBaseException, DataEmptyException, InvalidInputException {
//		proveedorDAO.update(new Proveedor(id, denominacion, telefono, email, direccion));
//
//	}
//
//	@Override
//	public List<TipoPrendaDTO> obtenerTipos() throws DataBaseException {
//		List<TipoPrenda> tipos = tipoDAO.findAll();
//		List<TipoPrendaDTO> tiposDTO = new ArrayList<TipoPrendaDTO>();
//		tiposDTO = tipos.stream().map(tipo -> new TipoPrendaDTO(tipo.getId(), tipo.getNombre()))
//				.collect(Collectors.toList());
//
//		return tiposDTO;
//	}
//
//	@Override
//	public List<TalleDTO> obtenerTalles() throws DataBaseException {
//		List<Talle> talles = talleDAO.findAll();
//		List<TalleDTO> tallesDTO = new ArrayList<TalleDTO>();
//		tallesDTO = talles.stream().map(t -> new TalleDTO(t.getId(), t.getNombre())).collect(Collectors.toList());
//		return tallesDTO;
//	}
//
//	@Override
//	public List<MarcaDTO> obtenerMarcas() throws DataBaseException {
//		List<Marca> marcas = marcaDAO.findAll();
//		List<MarcaDTO> marcasDTO = new ArrayList<MarcaDTO>();
//		marcasDTO = marcas.stream().map(marca -> new MarcaDTO(marca.getId(), marca.getNombre()))
//				.collect(Collectors.toList());
//
//		return marcasDTO;
//	}
//
//	@Override
//	public List<ProveedorDTO> obtenerProveedores() throws DataBaseException {
//		List<Proveedor> proveedores = proveedorDAO.findAll();
//		List<ProveedorDTO> proveedoresDTO = new ArrayList<ProveedorDTO>();
//		proveedoresDTO = proveedores.stream()
//				.map(proveedor -> new ProveedorDTO(proveedor.getId(), proveedor.getDenominacion(),
//						proveedor.getTelefono(), proveedor.getMail(), proveedor.getDireccion()))
//				.collect(Collectors.toList());
//
//		return proveedoresDTO;
//	}
//
//	@Override
//	public List<StockDTO> obtenerInventario() throws DataBaseException {
//		List<Stock> stock = stockDAO.findAll();
//		List<StockDTO> stockdto = new ArrayList<>();
//
//		for (Stock s : stock) {
//			MarcaDTO m = new MarcaDTO(s.getProducto().getMarca().getNombre());
//			TipoPrendaDTO tp = new TipoPrendaDTO(s.getProducto().getTipo().getNombre());
//			TalleDTO t = new TalleDTO(s.getProducto().getTalle().getNombre());
//			ProveedorDTO pr = new ProveedorDTO(s.getProducto().getProveedor().getDenominacion(),
//					s.getProducto().getProveedor().getTelefono(), s.getProducto().getProveedor().getMail(),
//					s.getProducto().getProveedor().getDireccion());
//			ProductoDTO p = new ProductoDTO(s.getProducto().getCodigo(), m, tp, t, s.getProducto().getPrecio(), pr);
//			stockdto.add(new StockDTO(p, s.getCantidad(), s.getFechaActualizacion()));
//		}
//		return stockdto;
//	}
//
//	@Override
//	public List<VentaDTO> obtenerVentas() throws DataBaseException {
//		List<Venta> ventas = ventaDAO.findAll();
//		List<VentaDTO> ventasDTO = new ArrayList<>();
//
//		for (Venta v : ventas) {
//			Carrito carrito = v.getCarrito();
//			List<ItemCarritoDTO> itemsCarritoDTO = new ArrayList<>();
//
//			for (ItemCarrito item : carrito.getListaProductos()) {
//				ProductoVenta producto = item.getProducto();
//
//				ProductoVentaDTO productoDTO = new ProductoVentaDTO(producto.getCodigo(), producto.getMarca(),
//						producto.getTipo(), producto.getTalle(), producto.getPrecio(), producto.getDenonimacion(),
//						producto.getTelefono(), producto.getMail(), producto.getDireccion());
//
//				ItemCarritoDTO itemCarritoDTO = new ItemCarritoDTO(productoDTO, item.getCantidad());
//				itemsCarritoDTO.add(itemCarritoDTO);
//			}
//
//			CarritoDTO carritoDTO = new CarritoDTO(carrito.getIdVenta(), itemsCarritoDTO, carrito.getMontoTotal());
//			VentaDTO ventaDTO = new VentaDTO(v.getId(), v.getFecha(), carritoDTO);
//
//			ventasDTO.add(ventaDTO);
//		}
//		Collections.sort(ventasDTO);
//		return ventasDTO;
//	}
//
//	@Override
//	public ProveedorDTO buscarProveedor(String denominacion) throws DataBaseException {
//
//		Proveedor proveedor = proveedorDAO.find(denominacion);
//		ProveedorDTO proveedorDTO = null;
//
//		if (proveedor != null) {
//			proveedorDTO = new ProveedorDTO(proveedor.getId(), proveedor.getDenominacion(), proveedor.getTelefono(),
//					proveedor.getMail(), proveedor.getDireccion());
//		}
//
//		return proveedorDTO;
//	}
//
//	@Override
//	public int consultarStock(String codigo) throws DataBaseException {
//		Stock stock = stockDAO.find(codigo);
//		return stock.getCantidad();
//	}
//
//	@Override
//	public void actualizarStock(String codigo, int cantidad, LocalDate date)
//			throws DataBaseException, DataEmptyException {
//		Stock stock = stockDAO.find(codigo);
//		stock.setCantidad(cantidad);
//		stock.setFechaActualizacion(date);
//		stockDAO.update(stock);
//	}
//
//	@Override
//	public void registrarVenta(Map<String, Integer> productosSeleccionados)
//			throws DataEmptyException, InvalidInputException, DataExistException, DataBaseException {
//
//		if (!productosSeleccionados.isEmpty()) {
//			List<ItemCarrito> itemscarrito = new ArrayList<>();
//			double montoTotalCarrito = 0;
//			for (Map.Entry<String, Integer> entry : productosSeleccionados.entrySet()) {
//				String idProducto = entry.getKey();
//				int cantidad = entry.getValue();
//				Producto producto = productoDAO.find(idProducto);
//				ProductoVenta productoVenta = new ProductoVenta(producto.getCodigo(), producto.getMarca().getNombre(),
//						producto.getTipo().getNombre(), producto.getTalle().getNombre(), producto.getPrecio(),
//						producto.getProveedor().getDenominacion(), producto.getProveedor().getTelefono(),
//						producto.getProveedor().getMail(), producto.getProveedor().getDireccion());
//				ItemCarrito itemCarrito = new ItemCarrito(productoVenta, cantidad);
//				itemscarrito.add(itemCarrito);
//				montoTotalCarrito += producto.getPrecio() * itemCarrito.getCantidad();
//			}
//			Carrito carrito = new Carrito(montoTotalCarrito);
//			carrito.setListaProductos(itemscarrito);
//			Venta venta = new Venta(LocalDate.now(), carrito);
//			ventaDAO.create(venta);
//		}
//	}
//
//	@Override
//	public ProductoDTO obtenerProducto(String codigo) throws DataBaseException {
//		Producto producto = productoDAO.find(codigo);
//		ProductoDTO productoDTO = null;
//		if (producto != null) {
//			productoDTO = new ProductoDTO(codigo,
//					new MarcaDTO(producto.getMarca().getId(), producto.getMarca().getNombre()),
//					new TipoPrendaDTO(producto.getTipo().getId(), producto.getTipo().getNombre()),
//					new TalleDTO(producto.getTalle().getId(), producto.getTalle().getNombre()), producto.getPrecio(),
//					new ProveedorDTO(producto.getProveedor().getDenominacion(), producto.getProveedor().getTelefono(),
//							producto.getProveedor().getMail(), producto.getProveedor().getDireccion()));
//		}
//		return productoDTO;
//	}
//
//	@Override
//	public String formatoFecha(LocalDate date) {
//		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-uuuu");
//		return date.format(formato);
//	}
//
//	@Override
//	public ResourceBundle obtenerIdiomas() {
//		return labels;
//	}
//
//	public void setLanguage(String idioma) {
//		if (idioma.equals("Italian")) {
//			labels = ResourceBundle.getBundle("labels", new Locale("it"));
//		} else if (idioma.equals("English")) {
//			labels = ResourceBundle.getBundle("labels", new Locale("en"));
//		} else if (idioma.equals("Español")) {
//			labels = ResourceBundle.getBundle("labels", new Locale("es"));
//		}
//	}
//
//	public LocalDate toLocalDate(Date date) {
//		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//	}
//
//	public void devolverProducto(int numeroVenta, String codigoProducto, int cantidadRestar) throws DataBaseException {
//		Venta venta = ventaDAO.find(numeroVenta);
//
//		if (venta != null) {
//			ItemCarrito itemcarrito = venta.getCarrito().buscarProducto(codigoProducto);
//
//			if (itemcarrito != null) {
//				int cantidadProductos = venta.getCantidadDeProductos();
//				if (cantidadRestar < itemcarrito.getCantidad()) {
//					itemcarrito.setCantidad(itemcarrito.getCantidad() - cantidadRestar);
//					itemCarritoDAO.update(itemcarrito);
//
//				} else if (cantidadRestar == itemcarrito.getCantidad()) {
//					if (cantidadProductos == 1) {
//						ventaDAO.remove(venta);
//					} else {
//						itemCarritoDAO.remove(itemcarrito);
//					}
//				}
//			}
//		}
//	}

}
