/*
 * Created by JFormDesigner on Mon Jun 19 11:42:41 BRT 2023
 */

package visao;

import java.awt.event.*;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import modelo.CadastrarAviaoModelo;
import util.PosicaoFormulario;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Pablo
 */
public class Main extends JPanel {
    public Main() {
        initComponents();
    }

    PosicaoFormulario form = new PosicaoFormulario();

    public static void main(String[] args) {
        FlatCarbonIJTheme.setup();
        JFrame frame = new JFrame("Reserva de passagens Aéreas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Main());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    private void jmiCadastrarAeronaveActionPerformed(ActionEvent e) {
        CadastrarAviaoVisao tela;
        form.abrirFormulario(tela = new CadastrarAviaoVisao(), jDesktop);
        tela.textField1.requestFocus();

    }

    private void jmiCadastrarVooActionPerformed(ActionEvent e) {
        CadastrarVooVisao tela;
        form.abrirFormulario(tela = new CadastrarVooVisao(), jDesktop);
        tela.jpnFormulario.remove(tela.jbtnCancelar);
        tela.jpnFormulario.remove(tela.jbtnConfirmar);
        tela.jpnFormulario.repaint();
        tela.jpnFormulario.revalidate();

    }

    private void jmiConsultarLugaresVaziosActionPerformed(ActionEvent e) {
        ConsultarLugaresVaziosVisao tela;
        form.abrirFormulario(tela = new ConsultarLugaresVaziosVisao(), jDesktop);
    }

    private void jmiFazerReservaActionPerformed(ActionEvent e) {
        FazerReservaVisao tela;
        form.abrirFormulario(tela = new FazerReservaVisao(), jDesktop);
        tela.jpnFormulario.remove(tela.label3);
        tela.jpnFormulario.remove(tela.textField3);
        tela.jpnFormulario.remove(tela.jbtnCancelar);
        tela.jpnFormulario.remove(tela.jbtnConfirmar);
    }

    private void jmiConsultarReservasActionPerformed(ActionEvent e) {
        ConsultarReservasVisao tela;
        form.abrirFormulario(tela = new ConsultarReservasVisao(), jDesktop);
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Pablo Ribeiro
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        jmiCadastrarAeronave = new JMenuItem();
        jmiCadastrarVoo = new JMenuItem();
        menu2 = new JMenu();
        jmiFazerReserva = new JMenuItem();
        jmiConsultarLugaresVazios = new JMenuItem();
        jmiConsultarReservas = new JMenuItem();
        jDesktop = new JDesktopPane();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
        border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER
        ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font
        . BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener(
        new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order"
        .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Par\u00e2metros do Sistema");
                menu1.setIcon(null);

                //---- jmiCadastrarAeronave ----
                jmiCadastrarAeronave.setText("Cadastrar Aeronave");
                jmiCadastrarAeronave.addActionListener(e -> jmiCadastrarAeronaveActionPerformed(e));
                menu1.add(jmiCadastrarAeronave);

                //---- jmiCadastrarVoo ----
                jmiCadastrarVoo.setText("Cadastrar Voo");
                jmiCadastrarVoo.addActionListener(e -> jmiCadastrarVooActionPerformed(e));
                menu1.add(jmiCadastrarVoo);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Reserva de passagens");

                //---- jmiFazerReserva ----
                jmiFazerReserva.setText("Fazer Reserva");
                jmiFazerReserva.addActionListener(e -> jmiFazerReservaActionPerformed(e));
                menu2.add(jmiFazerReserva);

                //---- jmiConsultarLugaresVazios ----
                jmiConsultarLugaresVazios.setText("Consultar Lugares Vazios");
                jmiConsultarLugaresVazios.addActionListener(e -> jmiConsultarLugaresVaziosActionPerformed(e));
                menu2.add(jmiConsultarLugaresVazios);

                //---- jmiConsultarReservas ----
                jmiConsultarReservas.setText("Consultar reservas realizadas");
                jmiConsultarReservas.addActionListener(e -> jmiConsultarReservasActionPerformed(e));
                menu2.add(jmiConsultarReservas);
            }
            menuBar1.add(menu2);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(menuBar1, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addComponent(jDesktop, GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jDesktop, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addGap(6, 6, 6))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Pablo Ribeiro
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem jmiCadastrarAeronave;
    private JMenuItem jmiCadastrarVoo;
    private JMenu menu2;
    private JMenuItem jmiFazerReserva;
    private JMenuItem jmiConsultarLugaresVazios;
    private JMenuItem jmiConsultarReservas;
    private JDesktopPane jDesktop;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
