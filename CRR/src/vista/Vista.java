package vista;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
        formatoVista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedor = new javax.swing.JPanel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jPanelBusqueda = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnImpuesto = new javax.swing.JButton();
        btnImpuestoDesc = new javax.swing.JButton();
        jPanelRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jPanelDescuentos = new javax.swing.JPanel();
        jToggleProntoPago = new javax.swing.JToggleButton();
        jToggleServicioPublico = new javax.swing.JToggleButton();
        jToggleTraslado = new javax.swing.JToggleButton();
        btnDescuentos = new javax.swing.JButton();
        jPanelSalida = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        valorDescuento = new javax.swing.JLabel();
        editLabel1 = new javax.swing.JLabel();
        editLabel2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanelContenedor.setBackground(new java.awt.Color(0, 0, 0));

        jPanelTitulo.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALCULADOR DE IMPUESTOS");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/48688.png"))); // NOI18N

        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setText("<html><u>Cerrar</u>");
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        dashboard.setBackground(new java.awt.Color(51, 51, 51));

        jPanelBusqueda.setBackground(new java.awt.Color(51, 51, 51));
        jPanelBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelBusqueda.setPreferredSize(new java.awt.Dimension(320, 277));

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(por placa)");

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar registro");

        btnModificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnModificar.setText("Modificar datos del vehículo");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Según búsqueda:");

        btnImpuesto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnImpuesto.setText("Calcular el impuesto del vehículo");

        btnImpuestoDesc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnImpuestoDesc.setText("Calcular impuesto del vehículo con descuento");

        javax.swing.GroupLayout jPanelBusquedaLayout = new javax.swing.GroupLayout(jPanelBusqueda);
        jPanelBusqueda.setLayout(jPanelBusquedaLayout);
        jPanelBusquedaLayout.setHorizontalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImpuestoDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                        .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBusquedaLayout.setVerticalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImpuestoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        jPanelRegistro.setBackground(new java.awt.Color(51, 51, 51));
        jPanelRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modelo");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Placa");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio");

        txtModelo.setBackground(new java.awt.Color(51, 51, 51));
        txtModelo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(255, 255, 255));

        txtMarca.setBackground(new java.awt.Color(51, 51, 51));
        txtMarca.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));

        txtPlaca.setBackground(new java.awt.Color(51, 51, 51));
        txtPlaca.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(255, 255, 255));

        txtPrecio.setBackground(new java.awt.Color(51, 51, 51));
        txtPrecio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));

        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca)
                            .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiar))
                .addGap(20, 20, 20))
        );

        jPanelDescuentos.setBackground(new java.awt.Color(51, 51, 51));
        jPanelDescuentos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Descuentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jToggleProntoPago.setBackground(new java.awt.Color(51, 51, 51));
        jToggleProntoPago.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jToggleProntoPago.setForeground(new java.awt.Color(255, 255, 255));
        jToggleProntoPago.setText("Descuento por pronto pago");

        jToggleServicioPublico.setBackground(new java.awt.Color(51, 51, 51));
        jToggleServicioPublico.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jToggleServicioPublico.setForeground(new java.awt.Color(255, 255, 255));
        jToggleServicioPublico.setText("Descuento vehículo de servicio público");

        jToggleTraslado.setBackground(new java.awt.Color(51, 51, 51));
        jToggleTraslado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jToggleTraslado.setForeground(new java.awt.Color(255, 255, 255));
        jToggleTraslado.setText("Descuento por traslado de cuenta");

        btnDescuentos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnDescuentos.setText("Submit");

        javax.swing.GroupLayout jPanelDescuentosLayout = new javax.swing.GroupLayout(jPanelDescuentos);
        jPanelDescuentos.setLayout(jPanelDescuentosLayout);
        jPanelDescuentosLayout.setHorizontalGroup(
            jPanelDescuentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescuentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDescuentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDescuentosLayout.createSequentialGroup()
                        .addComponent(jToggleProntoPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDescuentos))
                    .addGroup(jPanelDescuentosLayout.createSequentialGroup()
                        .addGroup(jPanelDescuentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleServicioPublico)
                            .addComponent(jToggleTraslado))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDescuentosLayout.setVerticalGroup(
            jPanelDescuentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDescuentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleServicioPublico)
                .addGap(18, 18, 18)
                .addComponent(jToggleTraslado)
                .addGap(18, 18, 18)
                .addGroup(jPanelDescuentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleProntoPago)
                    .addComponent(btnDescuentos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSalida.setBackground(new java.awt.Color(51, 51, 51));
        jPanelSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelSalida.setLayout(new java.awt.GridLayout(5, 0));
        jPanelSalida.add(filler1);

        valorDescuento.setBackground(new java.awt.Color(255, 255, 255));
        valorDescuento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        valorDescuento.setForeground(new java.awt.Color(255, 255, 255));
        valorDescuento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelSalida.add(valorDescuento);

        editLabel1.setBackground(new java.awt.Color(255, 255, 255));
        editLabel1.setForeground(new java.awt.Color(255, 255, 255));
        editLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLabel1.setText("Aquí se muestra su impuesto");
        jPanelSalida.add(editLabel1);

        editLabel2.setBackground(new java.awt.Color(255, 255, 255));
        editLabel2.setForeground(new java.awt.Color(255, 255, 255));
        editLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLabel2.setText("Calculador de impuestos");
        jPanelSalida.add(editLabel2);
        jPanelSalida.add(filler2);

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelDescuentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(jPanelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(jPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formatoVista() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDescuentos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImpuesto;
    private javax.swing.JButton btnImpuestoDesc;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel editLabel1;
    private javax.swing.JLabel editLabel2;
    private javax.swing.JLabel exitLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelDescuentos;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPanel jPanelSalida;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JToggleButton jToggleProntoPago;
    private javax.swing.JToggleButton jToggleServicioPublico;
    private javax.swing.JToggleButton jToggleTraslado;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel valorDescuento;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public javax.swing.JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public javax.swing.JButton getBtnBuscar() {
        return btnBuscar;
    }

    public javax.swing.JButton getBtnEliminar() {
        return btnEliminar;
    }

    public javax.swing.JButton getBtnModificar() {
        return btnModificar;
    }

    public javax.swing.JButton getBtnDescuentos() {
        return btnDescuentos;
    }

    public javax.swing.JButton getBtnImpuesto() {
        return btnImpuesto;
    }

    public javax.swing.JButton getBtnImpuestoDesc() {
        return btnImpuestoDesc;
    }

    public javax.swing.JToggleButton getjToggleProntoPago() {
        return jToggleProntoPago;
    }

    public javax.swing.JToggleButton getjToggleServicioPublico() {
        return jToggleServicioPublico;
    }

    public javax.swing.JToggleButton getjToggleTraslado() {
        return jToggleTraslado;
    }

    public javax.swing.JTextField getTxtMarca() {
        return txtMarca;
    }

    public javax.swing.JTextField getTxtModelo() {
        return txtModelo;
    }

    public javax.swing.JTextField getTxtPlaca() {
        return txtPlaca;
    }

    public javax.swing.JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public javax.swing.JLabel getValorDescuento() {
        return valorDescuento;
    }

    public javax.swing.JLabel getEditLabel1() {
        return editLabel1;
    }

    public javax.swing.JLabel getEditLabel2() {
        return editLabel2;
    }

    public javax.swing.JLabel getExitLabel() {
        return exitLabel;
    }

}
