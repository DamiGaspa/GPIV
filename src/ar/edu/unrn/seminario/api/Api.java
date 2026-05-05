package ar.edu.unrn.seminario.api;

public interface Api {

//	void bajaProducto(String codigo) throws DataBaseException;
//
//	void modificarStock(String codigo, int i, int j, int k, double precio, int l, int m)
//			throws DataEmptyException, DataExistException, DataBaseException;
//
//	void altaTalle(String nombre) throws DataEmptyException, DataExistException, DataBaseException;
//
//	void bajaTalle(String nombre) throws DataBaseException, DataEmptyException;
//
//	void modificarTalle(int id, String nombre_nuevo) throws DataBaseException, DataEmptyException, DataExistException;
//
//	void altaPrenda(String nombre) throws DataEmptyException, DataExistException, DataBaseException;
//
//	void bajaPrenda(String nombre) throws DataBaseException, DataEmptyException;
//
//	void modificarPrenda(int id, String nombre_nuevo) throws DataBaseException, DataEmptyException, DataExistException;
//
//	void altaMarca(String marca) throws DataEmptyException, DataExistException, DataBaseException;
//
//	void bajaMarca(String nombre) throws DataBaseException, DataEmptyException;
//
//	void modificarMarca(int id, String nombre_nuevo) throws DataBaseException, DataEmptyException, DataExistException;
//
//	void altaProveedor(String denominacion, String telefono, String mail, String direccion)
//			throws DataEmptyException, DataExistException, InvalidInputException, DataBaseException;
//
//	void bajaProveedor(String denominacion) throws DataBaseException;
//
//	void modificarProveedor(int id, String denominacion, String telefono, String mail, String direccion)
//			throws DataBaseException, DataEmptyException, InvalidInputException;
//
//	List<TipoPrendaDTO> obtenerTipos() throws DataBaseException;
//
//	List<TalleDTO> obtenerTalles() throws DataBaseException;
//
//	List<MarcaDTO> obtenerMarcas() throws DataBaseException;
//
//	List<ProveedorDTO> obtenerProveedores() throws DataBaseException;
//
//	List<StockDTO> obtenerInventario() throws DataBaseException;
//
//	List<VentaDTO> obtenerVentas() throws DataBaseException;
//
//	ProveedorDTO buscarProveedor(String denominacion) throws DataBaseException;
//
//	int consultarStock(String codigo) throws DataBaseException;
//
//	void actualizarStock(String codigo, int cantidad, LocalDate date) throws DataBaseException, DataEmptyException;
//
//	void registrarVenta(Map<String, Integer> productosSeleccionados)
//			throws DataEmptyException, InvalidInputException, DataExistException, DataBaseException;
//
//	ProductoDTO obtenerProducto(String codigo) throws DataBaseException;
//
//	String formatoFecha(LocalDate date);
//
//	void altaProducto(String codigo, int marca, int tipo, int talle, double precio, int proveedor, int cantidad)
//			throws DataEmptyException, DataExistException, DataBaseException;
//
//	ResourceBundle obtenerIdiomas();
//
//	void setLanguage(String idioma);
//
//	LocalDate toLocalDate (Date date);
//
//	void devolverProducto(int numeroVenta, String codigoProducto, int cantidadRestar) throws DataBaseException;
}
