package com.jhairdev.ui_threads;

import com.jhairdev.utils.Panel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Alejandro González Navarro
 */
public class FormMain extends javax.swing.JFrame implements KeyListener {
    // Layout que muestra los diferentes paneles del aplicativo
    private CardLayout cardLayout = new CardLayout();
    // Panel usado para el juego
    protected static Panel[][] tablero;
    // Hilo serpiente, se encargar de la lógica de la serpiente
    private Serpiente serpiente;
    // Clase que se encarga de guardar y leer información de la tabla de puntuaciones
    private TablaDePuntuacion tablaDePuntuacion;
    // Paneles de ancho del tablero 
    private int width;
    // Paneles de alto del tablero 
    private int height;
    // velocidad que llevará la serpiente
    private int velocidad;
    /**
     * Creates new form NewJFrame
     */
    public FormMain() {
        initComponents();
        // Ajustes iniciales
        this.setLocationRelativeTo(null);
        this.width = 70;
        this.height = 34;
        this.velocidad = 300;
        addKeyListener(this);
        cardLayout = (CardLayout)jPanelPrincipal.getLayout();
        cardLayout.show(jPanelPrincipal, "PanelInicio");
        tablaDePuntuacion = new TablaDePuntuacion();
    }

    private void crearTablero(){
        FormMain.tablero = new Panel[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                FormMain.tablero[i][j] = new Panel( Color.WHITE , i*20 , j*20 , 20 , 20 );
                jPanelTablero.add(tablero[i][j]);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupDificultad = new javax.swing.ButtonGroup();
        buttonGroupTamaño = new javax.swing.ButtonGroup();
        buttonGroupVelocidad = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelInicio = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelAjusVelocidad = new javax.swing.JLabel();
        jRadioButtonVelBaja = new javax.swing.JRadioButton();
        jRadioButtonVelMedia = new javax.swing.JRadioButton();
        jRadioButtonVelAlta = new javax.swing.JRadioButton();
        jButtonComenzar = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jLabelInfo = new javax.swing.JLabel();
        jPanelSerpienteInfo = new javax.swing.JPanel();
        jLabelSerpienteInfo = new javax.swing.JLabel();
        jPanelManzanInfo = new javax.swing.JPanel();
        jLabelManzanaInfo = new javax.swing.JLabel();
        jPanelVelocidadInfo = new javax.swing.JPanel();
        jLabelVelocidadInfo = new javax.swing.JLabel();
        jLabelClockImgInfo = new javax.swing.JLabel();
        jLabelClockInfo = new javax.swing.JLabel();
        jButtonVolverInfo = new javax.swing.JButton();
        jPanelJuego = new javax.swing.JPanel();
        jPanelTablero = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jLabelTiempo = new javax.swing.JLabel();
        jLabelTiempoC = new javax.swing.JLabel();
        jLabelManzanas = new javax.swing.JLabel();
        jLabelManzanasC = new javax.swing.JLabel();
        jLabelPuntuacion = new javax.swing.JLabel();
        jLabelPuntuacionC = new javax.swing.JLabel();
        jLabelVelocidad = new javax.swing.JLabel();
        jLabelVelocidadC = new javax.swing.JLabel();
        jPanelEspaciadorUI = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/logo_icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(750, 450));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanelPrincipal.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(600, 450));
        jPanelPrincipal.setLayout(new java.awt.CardLayout());

        jPanelInicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInicio.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanelInicio.setPreferredSize(new java.awt.Dimension(600, 450));
        java.awt.GridBagLayout jPanelInicioLayout = new java.awt.GridBagLayout();
        jPanelInicioLayout.columnWidths = new int[] {0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0};
        jPanelInicioLayout.rowHeights = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0};
        jPanelInicio.setLayout(jPanelInicioLayout);

        jLabelLogo.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/logo_snake.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        jPanelInicio.add(jLabelLogo, gridBagConstraints);

        jLabelAjusVelocidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAjusVelocidad.setText("Seleccione la dificultad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelInicio.add(jLabelAjusVelocidad, gridBagConstraints);

        jRadioButtonVelBaja.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupVelocidad.add(jRadioButtonVelBaja);
        jRadioButtonVelBaja.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jRadioButtonVelBaja.setSelected(true);
        jRadioButtonVelBaja.setText("Fácil");
        jRadioButtonVelBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVelBajaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelInicio.add(jRadioButtonVelBaja, gridBagConstraints);

        jRadioButtonVelMedia.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupVelocidad.add(jRadioButtonVelMedia);
        jRadioButtonVelMedia.setText("Media");
        jRadioButtonVelMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVelMediaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelInicio.add(jRadioButtonVelMedia, gridBagConstraints);

        jRadioButtonVelAlta.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupVelocidad.add(jRadioButtonVelAlta);
        jRadioButtonVelAlta.setText("Difícil");
        jRadioButtonVelAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVelAltaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelInicio.add(jRadioButtonVelAlta, gridBagConstraints);

        jButtonComenzar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonComenzar.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        jButtonComenzar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonComenzar.setText("Iniciar juego");
        jButtonComenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonComenzar.setNextFocusableComponent(this);
        jButtonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComenzarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelInicio.add(jButtonComenzar, gridBagConstraints);

        jButtonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/info_snake.png"))); // NOI18N
        jButtonInfo.setBorder(null);
        jButtonInfo.setBorderPainted(false);
        jButtonInfo.setContentAreaFilled(false);
        jButtonInfo.setFocusPainted(false);
        jButtonInfo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanelInicio.add(jButtonInfo, gridBagConstraints);

        jPanel1.setPreferredSize(new java.awt.Dimension(420, 70));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setText("ZZZ");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setText("Juega a");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        jPanelInicio.add(jPanel1, gridBagConstraints);

        jPanelPrincipal.add(jPanelInicio, "PanelInicio");

        jPanelInfo.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout jPanelInfoLayout = new java.awt.GridBagLayout();
        jPanelInfoLayout.columnWidths = new int[] {0, 10, 0};
        jPanelInfoLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanelInfo.setLayout(jPanelInfoLayout);

        jLabelInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelInfo.setText("<html>Mientras juegas aparecerán manzanas en el campo.<br>Haz que tu serpiente se alimente de estas manzanas.<br>  Cuidado con chocar contra la pared o contra tu propio cuerpo.</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanelInfo.add(jLabelInfo, gridBagConstraints);

        jPanelSerpienteInfo.setBackground(new java.awt.Color(0, 0, 0));
        jPanelSerpienteInfo.setPreferredSize(new java.awt.Dimension(20, 60));

        javax.swing.GroupLayout jPanelSerpienteInfoLayout = new javax.swing.GroupLayout(jPanelSerpienteInfo);
        jPanelSerpienteInfo.setLayout(jPanelSerpienteInfoLayout);
        jPanelSerpienteInfoLayout.setHorizontalGroup(
            jPanelSerpienteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelSerpienteInfoLayout.setVerticalGroup(
            jPanelSerpienteInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanelInfo.add(jPanelSerpienteInfo, gridBagConstraints);

        jLabelSerpienteInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSerpienteInfo.setText("Esta es tu serpiente. Usa las flechas direccionales o W A S D para moverte por el tablero.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanelInfo.add(jLabelSerpienteInfo, gridBagConstraints);

        jPanelManzanInfo.setBackground(java.awt.Color.red);
        jPanelManzanInfo.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanelManzanInfoLayout = new javax.swing.GroupLayout(jPanelManzanInfo);
        jPanelManzanInfo.setLayout(jPanelManzanInfoLayout);
        jPanelManzanInfoLayout.setHorizontalGroup(
            jPanelManzanInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelManzanInfoLayout.setVerticalGroup(
            jPanelManzanInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanelInfo.add(jPanelManzanInfo, gridBagConstraints);

        jLabelManzanaInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelManzanaInfo.setText("Las manzanas te dan 100 puntos pero tambien añaden dificultad haciendo mas grande a la serpiente.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanelInfo.add(jLabelManzanaInfo, gridBagConstraints);

        jPanelVelocidadInfo.setBackground(java.awt.Color.blue);
        jPanelVelocidadInfo.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jPanelVelocidadInfoLayout = new javax.swing.GroupLayout(jPanelVelocidadInfo);
        jPanelVelocidadInfo.setLayout(jPanelVelocidadInfoLayout);
        jPanelVelocidadInfoLayout.setHorizontalGroup(
            jPanelVelocidadInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelVelocidadInfoLayout.setVerticalGroup(
            jPanelVelocidadInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanelInfo.add(jPanelVelocidadInfo, gridBagConstraints);

        jLabelVelocidadInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelVelocidadInfo.setText("Los aumentos de velocidad no dan puntos, pero aumentan tu velocidad hasta 10 veces.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanelInfo.add(jLabelVelocidadInfo, gridBagConstraints);

        jLabelClockImgInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/clock_mini.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanelInfo.add(jLabelClockImgInfo, gridBagConstraints);

        jLabelClockInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelClockInfo.setText("¡El tiempo vuela! Por cada segundo perderas 10 puntos.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanelInfo.add(jLabelClockInfo, gridBagConstraints);

        jButtonVolverInfo.setText("Volver");
        jButtonVolverInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverInfoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        jPanelInfo.add(jButtonVolverInfo, gridBagConstraints);

        jPanelPrincipal.add(jPanelInfo, "PanelInfo");

        jPanelJuego.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanelJuego.setPreferredSize(new java.awt.Dimension(600, 450));
        java.awt.GridBagLayout jPanelJuegoLayout = new java.awt.GridBagLayout();
        jPanelJuegoLayout.columnWidths = new int[] {0, 25, 0, 25, 0};
        jPanelJuegoLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0};
        jPanelJuego.setLayout(jPanelJuegoLayout);

        jPanelTablero.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanelTablero.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanelTablero.setName(""); // NOI18N
        jPanelTablero.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout jPanelTableroLayout = new javax.swing.GroupLayout(jPanelTablero);
        jPanelTablero.setLayout(jPanelTableroLayout);
        jPanelTableroLayout.setHorizontalGroup(
            jPanelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanelTableroLayout.setVerticalGroup(
            jPanelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelJuego.add(jPanelTablero, gridBagConstraints);

        jPanelSuperior.setLayout(new javax.swing.BoxLayout(jPanelSuperior, javax.swing.BoxLayout.LINE_AXIS));

        jLabelTiempo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTiempo.setText("Tiempo:     ");
        jPanelSuperior.add(jLabelTiempo);

        jLabelTiempoC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTiempoC.setText("00:00");
        jPanelSuperior.add(jLabelTiempoC);

        jLabelManzanas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelManzanas.setText("      Manzanas:     ");
        jPanelSuperior.add(jLabelManzanas);

        jLabelManzanasC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelManzanasC.setText("0");
        jPanelSuperior.add(jLabelManzanasC);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanelJuego.add(jPanelSuperior, gridBagConstraints);

        jLabelPuntuacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPuntuacion.setText("Puntuación:    ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanelJuego.add(jLabelPuntuacion, gridBagConstraints);

        jLabelPuntuacionC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPuntuacionC.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanelJuego.add(jLabelPuntuacionC, gridBagConstraints);

        jLabelVelocidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelVelocidad.setText("Velocidad:    ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanelJuego.add(jLabelVelocidad, gridBagConstraints);

        jLabelVelocidadC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelVelocidadC.setText("0/10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanelJuego.add(jLabelVelocidadC, gridBagConstraints);

        jPanelEspaciadorUI.setPreferredSize(new java.awt.Dimension(60, 1));

        javax.swing.GroupLayout jPanelEspaciadorUILayout = new javax.swing.GroupLayout(jPanelEspaciadorUI);
        jPanelEspaciadorUI.setLayout(jPanelEspaciadorUILayout);
        jPanelEspaciadorUILayout.setHorizontalGroup(
            jPanelEspaciadorUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelEspaciadorUILayout.setVerticalGroup(
            jPanelEspaciadorUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanelJuego.add(jPanelEspaciadorUI, gridBagConstraints);

        jPanelPrincipal.add(jPanelJuego, "PanelJuego");

        getContentPane().add(jPanelPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics g) {
        // Ajusta el tamaño del frame y el tablero
        this.setSize((this.width*20)+260, (this.height*20)+140);
        jPanelTablero.setMinimumSize(new Dimension((this.width*20), (this.height*20)));
        jPanelTablero.setPreferredSize(new Dimension((this.width*20), (this.height*20)));
        this.setLocationRelativeTo(null);
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void jButtonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComenzarActionPerformed
        // Añade el tablero
        crearTablero();
        repaint();
        // Inicializa la serpiente
        this.serpiente = new Serpiente(this.width, this.height, this.velocidad);
        // Inicia los contadores
        jLabelManzanasC.setText("0");
        jLabelPuntuacionC.setText("0");
        jLabelVelocidadC.setText("0/10");
        jLabelTiempoC.setText("00:00");
        // Muestra el panel de juego
        cardLayout.show(jPanelPrincipal, "PanelJuego");
        // Obtiene el foco para que funcione el keylistener
        this.requestFocus();
        // Inicia el juego
        serpiente.start();
        // Listener para cuando la serpiente acabe mostrar el panel
        new Thread(new Runnable(){
            public void run(){
            try{serpiente.join();}
            catch(Exception e){;}
            finally{
                dispose();
                /* quitar dispose y descomentar si se quiere guardar de forma externa
                para implementar de forma externa cambiar ruta de archivo en TablaDePuntuación
                // Recupera la lista para mostrar
                String[][] tabla = tablaDePuntuacion.recuperarLista();
                jLabelPuntNombre1.setText(tabla[0][0]);
                jLabelPuntPuntuacion1.setText(tabla[0][1]);
                jLabelPuntNombre2.setText(tabla[1][0]);
                jLabelPuntPuntuacion2.setText(tabla[1][1]);
                jLabelPuntNombre3.setText(tabla[2][0]);
                jLabelPuntPuntuacion3.setText(tabla[2][1]);
                cardLayout.show(jPanelPrincipal, "PanelPuntuacion");
                tabla = null;*/
            }}
        }).start();
    }//GEN-LAST:event_jButtonComenzarActionPerformed

    private void jRadioButtonVelAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVelAltaActionPerformed

        this.velocidad = 100;
    }//GEN-LAST:event_jRadioButtonVelAltaActionPerformed

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        cardLayout.show(jPanelPrincipal, "PanelInfo");
    }//GEN-LAST:event_jButtonInfoActionPerformed

    private void jButtonVolverInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverInfoActionPerformed
        cardLayout.show(jPanelPrincipal, "PanelInicio");
    }//GEN-LAST:event_jButtonVolverInfoActionPerformed

    private void jRadioButtonVelMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVelMediaActionPerformed

        this.velocidad = 200;
    }//GEN-LAST:event_jRadioButtonVelMediaActionPerformed

    private void jRadioButtonVelBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVelBajaActionPerformed

        this.velocidad = 300;
    }//GEN-LAST:event_jRadioButtonVelBajaActionPerformed

    @Override
    public void keyPressed(KeyEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        serpiente.setDireccion(arg0.getKeyCode());
    }
    
    @Override
    public void keyTyped(KeyEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDificultad;
    private javax.swing.ButtonGroup buttonGroupTamaño;
    private javax.swing.ButtonGroup buttonGroupVelocidad;
    private javax.swing.JButton jButtonComenzar;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonVolverInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAjusVelocidad;
    private javax.swing.JLabel jLabelClockImgInfo;
    private javax.swing.JLabel jLabelClockInfo;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelManzanaInfo;
    private javax.swing.JLabel jLabelManzanas;
    protected static javax.swing.JLabel jLabelManzanasC;
    private javax.swing.JLabel jLabelPuntuacion;
    protected static javax.swing.JLabel jLabelPuntuacionC;
    private javax.swing.JLabel jLabelSerpienteInfo;
    private javax.swing.JLabel jLabelTiempo;
    protected static javax.swing.JLabel jLabelTiempoC;
    private javax.swing.JLabel jLabelVelocidad;
    protected static javax.swing.JLabel jLabelVelocidadC;
    private javax.swing.JLabel jLabelVelocidadInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelEspaciadorUI;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelJuego;
    private javax.swing.JPanel jPanelManzanInfo;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelSerpienteInfo;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JPanel jPanelTablero;
    private javax.swing.JPanel jPanelVelocidadInfo;
    private javax.swing.JRadioButton jRadioButtonVelAlta;
    private javax.swing.JRadioButton jRadioButtonVelBaja;
    private javax.swing.JRadioButton jRadioButtonVelMedia;
    // End of variables declaration//GEN-END:variables
}