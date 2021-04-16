package regine_interfata_grafica;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fereastra extends JFrame {

    private int nrB;
    private JButton jb[];
    private JButton jbRefresh;
    private JButton jbCheck;
    private int i, j;
    private int[] v = new int[100];

    public Fereastra(int nrB) {
        //DECLARARE COMPONENTE GRAFICE
        this.setTitle("Asezarea reginelor pe tabla ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.nrB = nrB;
        jb = new JButton[100];
        int i, j;
        int N = (int) Math.sqrt(nrB);

        //DESIGN
        JPanel jp[] = new JPanel[N];
        Font font = new Font("Arial", Font.PLAIN, 16);
        for (i = 0; i < N; i++) {
            jp[i] = new JPanel();
            for (j = 0; j < N; j++) {
                int nrButonCrt = N * i + j;
                String numeButonCrt = nrButonCrt + "";
                jb[nrButonCrt] = new JButton();
                jb[nrButonCrt].setPreferredSize(new Dimension(60, 60));
                jp[i].add(jb[nrButonCrt]);
            }
        }
        JPanel jpFinal = new JPanel();
        jpFinal.setLayout(new GridLayout(N + 1, 1));
        for (i = 0; i < N; i++) {
            jpFinal.add(jp[i]);
        }
        JPanel jPanel2 = new JPanel();
        AscultaButoane ab = new AscultaButoane();
        for (i = 0; i < nrB; i++) {
            jb[i].addActionListener(ab);
        }
        jbRefresh = new JButton("Golire tabla");
        jbRefresh.setFont(font);
        jbRefresh.addActionListener(ab);
        jbRefresh.setPreferredSize(new Dimension(160, 40));
        jPanel2.add(jbRefresh);
        jbCheck = new JButton("Verificare solutie");
        jbCheck.setFont(font);
        jbCheck.addActionListener(ab);
        jbCheck.setPreferredSize(new Dimension(160, 40));
        jPanel2.add(jbCheck);
        jpFinal.add(jPanel2);
        Container c = this.getContentPane();
        c.add(jpFinal, "South");

        //Initializare tabla:
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                int nrButonCrt = N * i + j;
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        jb[nrButonCrt].setBackground(Color.gray);
                    } else {
                        jb[nrButonCrt].setBackground(Color.white);
                    }
                } else if (j % 2 == 0) {
                    jb[nrButonCrt].setBackground(Color.white);
                } else {
                    jb[nrButonCrt].setBackground(Color.gray);
                }
            }
        }

    }

    //EVENIMENTE
    class AscultaButoane implements ActionListener {

        int ok = 0;

        @Override
        public void actionPerformed(ActionEvent ev) {
            Object sursa = ev.getSource();
            int n = (int) Math.sqrt(nrB);
            int rez[] = new int[n];
            Regine obj = new Regine(nrB, rez);
            int sol = 0;
            obj.BT(n);
            if ((JButton) sursa == jbRefresh) {
                int i, j;
                ImageIcon gri = new ImageIcon("gri.jpg");
                ImageIcon alb = new ImageIcon("alb.jpg");
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        int nrButonCrt = n * i + j;
                        if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                            jb[nrButonCrt].setIcon(gri);
                        } else {
                            jb[nrButonCrt].setIcon(alb);
                        }
                    }
                }
                for (i = 0; i < 100; i++) {
                    v[i] = 0;
                }
            }

            //Pozitionarea reginelor pe butoane:
            if ((JButton) sursa == jb[0]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[0].setIcon(imagine);
                v[0] = 1;
            }

            if ((JButton) sursa == jb[1]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[1].setIcon(imagine);
                v[1] = 1;

            }
            if ((JButton) sursa == jb[2]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[2].setIcon(imagine);
                v[2] = 1;
            }
            if ((JButton) sursa == jb[3]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[3].setIcon(imagine);
                v[3] = 1;
            }
            if ((JButton) sursa == jb[4]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[4].setIcon(imagine);
                v[4] = 1;
            }
            if ((JButton) sursa == jb[5]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[5].setIcon(imagine);
                v[5] = 1;
            }
            if ((JButton) sursa == jb[6]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[6].setIcon(imagine);
                v[6] = 1;
            }
            if ((JButton) sursa == jb[7]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[7].setIcon(imagine);
                v[7] = 1;
            }
            if ((JButton) sursa == jb[8]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[8].setIcon(imagine);
                v[8] = 1;
            }
            if ((JButton) sursa == jb[9]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[9].setIcon(imagine);
                v[9] = 1;
            }
            if ((JButton) sursa == jb[10]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[10].setIcon(imagine);
                v[10] = 1;
            }
            if ((JButton) sursa == jb[11]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[11].setIcon(imagine);
                v[11] = 1;
            }
            if ((JButton) sursa == jb[12]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[12].setIcon(imagine);
                v[12] = 1;
            }
            if ((JButton) sursa == jb[13]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[13].setIcon(imagine);
                v[13] = 1;
            }
            if ((JButton) sursa == jb[14]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[14].setIcon(imagine);
                v[14] = 1;
            }
            if ((JButton) sursa == jb[15]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[15].setIcon(imagine);
                v[15] = 1;
            }
            if ((JButton) sursa == jb[16]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[16].setIcon(imagine);
                v[16] = 1;
            }
            if ((JButton) sursa == jb[17]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[17].setIcon(imagine);
                v[17] = 1;
            }
            if ((JButton) sursa == jb[18]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[18].setIcon(imagine);
                v[18] = 1;
            }
            if ((JButton) sursa == jb[19]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[19].setIcon(imagine);
                v[19] = 1;
            }
            if ((JButton) sursa == jb[20]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[20].setIcon(imagine);
                v[20] = 1;
            }
            if ((JButton) sursa == jb[21]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[21].setIcon(imagine);
                v[21] = 1;
            }
            if ((JButton) sursa == jb[22]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[22].setIcon(imagine);
                v[22] = 1;
            }

            if ((JButton) sursa == jb[23]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[23].setIcon(imagine);
                v[23] = 1;
            }
            if ((JButton) sursa == jb[24]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[24].setIcon(imagine);
                v[24] = 1;
            }
            if ((JButton) sursa == jb[25]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[25].setIcon(imagine);
                v[25] = 1;
            }
            if ((JButton) sursa == jb[26]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[26].setIcon(imagine);
                v[26] = 1;
            }
            if ((JButton) sursa == jb[27]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[27].setIcon(imagine);
                v[27] = 1;
            }
            if ((JButton) sursa == jb[28]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[28].setIcon(imagine);
                v[28] = 1;
            }
            if ((JButton) sursa == jb[29]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[29].setIcon(imagine);
                v[29] = 1;
            }
            if ((JButton) sursa == jb[30]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[30].setIcon(imagine);
                v[30] = 1;
            }
            if ((JButton) sursa == jb[31]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[31].setIcon(imagine);
                v[31] = 1;
            }
            if ((JButton) sursa == jb[32]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[32].setIcon(imagine);
                v[32] = 1;
            }
            if ((JButton) sursa == jb[33]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[33].setIcon(imagine);
                v[33] = 1;
            }
            if ((JButton) sursa == jb[34]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[34].setIcon(imagine);
                v[34] = 1;
            }
            if ((JButton) sursa == jb[35]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[35].setIcon(imagine);
                v[35] = 1;
            }
            if ((JButton) sursa == jb[36]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[36].setIcon(imagine);
                v[36] = 1;
            }
            if ((JButton) sursa == jb[37]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[37].setIcon(imagine);
                v[37] = 1;
            }
            if ((JButton) sursa == jb[38]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[38].setIcon(imagine);
                v[38] = 1;
            }
            if ((JButton) sursa == jb[39]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[39].setIcon(imagine);
                v[39] = 1;
            }
            if ((JButton) sursa == jb[40]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[40].setIcon(imagine);
                v[40] = 1;
            }
            if ((JButton) sursa == jb[41]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[41].setIcon(imagine);
                v[41] = 1;
            }
            if ((JButton) sursa == jb[42]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[42].setIcon(imagine);
                v[42] = 1;
            }
            if ((JButton) sursa == jb[43]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[43].setIcon(imagine);
                v[43] = 1;
            }
            if ((JButton) sursa == jb[44]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[44].setIcon(imagine);
                v[44] = 1;
            }
            if ((JButton) sursa == jb[45]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[45].setIcon(imagine);
                v[45] = 1;
            }
            if ((JButton) sursa == jb[46]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[46].setIcon(imagine);
                v[46] = 1;
            }
            if ((JButton) sursa == jb[47]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[47].setIcon(imagine);
                v[47] = 1;
            }
            if ((JButton) sursa == jb[48]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[48].setIcon(imagine);
                v[48] = 1;
            }
            if ((JButton) sursa == jb[49]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[49].setIcon(imagine);
                v[49] = 1;
            }
            if ((JButton) sursa == jb[50]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[50].setIcon(imagine);
                v[50] = 1;
            }
            if ((JButton) sursa == jb[51]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[51].setIcon(imagine);
                v[51] = 1;
            }
            if ((JButton) sursa == jb[52]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[52].setIcon(imagine);
                v[52] = 1;
            }
            if ((JButton) sursa == jb[53]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[53].setIcon(imagine);
                v[53] = 1;
            }
            if ((JButton) sursa == jb[54]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[54].setIcon(imagine);
                v[54] = 1;
            }
            if ((JButton) sursa == jb[55]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[55].setIcon(imagine);
                v[55] = 1;
            }
            if ((JButton) sursa == jb[56]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[56].setIcon(imagine);
                v[56] = 1;
            }
            if ((JButton) sursa == jb[57]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[57].setIcon(imagine);
                v[57] = 1;
            }
            if ((JButton) sursa == jb[58]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[58].setIcon(imagine);
                v[58] = 1;
            }
            if ((JButton) sursa == jb[59]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[59].setIcon(imagine);
                v[59] = 1;
            }
            if ((JButton) sursa == jb[60]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[60].setIcon(imagine);
                v[60] = 1;
            }
            if ((JButton) sursa == jb[61]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[61].setIcon(imagine);
                v[61] = 1;
            }
            if ((JButton) sursa == jb[62]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[62].setIcon(imagine);
                v[62] = 1;
            }
            if ((JButton) sursa == jb[63]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[63].setIcon(imagine);
                v[63] = 1;
            }
            if ((JButton) sursa == jb[64]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[64].setIcon(imagine);
                v[64] = 1;
            }
            if ((JButton) sursa == jb[65]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[65].setIcon(imagine);
                v[65] = 1;
            }
            if ((JButton) sursa == jb[66]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[66].setIcon(imagine);
                v[66] = 1;
            }
            if ((JButton) sursa == jb[67]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[67].setIcon(imagine);
                v[67] = 1;
            }
            if ((JButton) sursa == jb[68]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[68].setIcon(imagine);
                v[68] = 1;
            }
            if ((JButton) sursa == jb[69]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[69].setIcon(imagine);
                v[69] = 1;
            }
            if ((JButton) sursa == jb[70]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[70].setIcon(imagine);
                v[70] = 1;
            }
            if ((JButton) sursa == jb[71]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[71].setIcon(imagine);
                v[71] = 1;
            }
            if ((JButton) sursa == jb[72]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[72].setIcon(imagine);
                v[72] = 1;
            }
            if ((JButton) sursa == jb[73]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[73].setIcon(imagine);
                v[73] = 1;
            }
            if ((JButton) sursa == jb[74]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[74].setIcon(imagine);
                v[74] = 1;
            }
            if ((JButton) sursa == jb[75]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[75].setIcon(imagine);
                v[75] = 1;
            }
            if ((JButton) sursa == jb[76]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[76].setIcon(imagine);
                v[76] = 1;
            }
            if ((JButton) sursa == jb[77]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[77].setIcon(imagine);
                v[77] = 1;
            }
            if ((JButton) sursa == jb[78]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[78].setIcon(imagine);
                v[78] = 1;
            }
            if ((JButton) sursa == jb[79]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[79].setIcon(imagine);
                v[79] = 1;
            }
            if ((JButton) sursa == jb[80]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[80].setIcon(imagine);
                v[80] = 1;
            }
            if ((JButton) sursa == jb[81]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[81].setIcon(imagine);
                v[81] = 1;
            }
            if ((JButton) sursa == jb[82]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[82].setIcon(imagine);
                v[82] = 1;
            }
            if ((JButton) sursa == jb[83]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[83].setIcon(imagine);
                v[83] = 1;
            }
            if ((JButton) sursa == jb[84]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[84].setIcon(imagine);
                v[84] = 1;
            }
            if ((JButton) sursa == jb[85]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[85].setIcon(imagine);
                v[85] = 1;
            }
            if ((JButton) sursa == jb[86]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[86].setIcon(imagine);
                v[86] = 1;
            }
            if ((JButton) sursa == jb[87]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[87].setIcon(imagine);
                v[87] = 1;
            }
            if ((JButton) sursa == jb[88]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[88].setIcon(imagine);
                v[88] = 1;
            }
            if ((JButton) sursa == jb[89]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[89].setIcon(imagine);
                v[89] = 1;
            }
            if ((JButton) sursa == jb[90]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[90].setIcon(imagine);
                v[90] = 1;
            }
            if ((JButton) sursa == jb[91]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[91].setIcon(imagine);
                v[91] = 1;
            }
            if ((JButton) sursa == jb[92]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[92].setIcon(imagine);
                v[92] = 1;
            }
            if ((JButton) sursa == jb[93]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[93].setIcon(imagine);
                v[93] = 1;
            }
            if ((JButton) sursa == jb[94]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[94].setIcon(imagine);
                v[94] = 1;
            }
            if ((JButton) sursa == jb[95]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[95].setIcon(imagine);
                v[95] = 1;
            }
            if ((JButton) sursa == jb[96]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[96].setIcon(imagine);
                v[96] = 1;
            }
            if ((JButton) sursa == jb[97]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[97].setIcon(imagine);
                v[97] = 1;
            }
            if ((JButton) sursa == jb[98]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[98].setIcon(imagine);
                v[98] = 1;
            }
            if ((JButton) sursa == jb[99]) {
                ImageIcon imagine = new ImageIcon("mica.png");
                jb[99].setIcon(imagine);
                v[99] = 1;
            }

            if ((JButton) sursa == jbCheck) {
                int nr;
                int nrCorecte;
                int ok = 0;
                for (i = 0; i < obj.nrSol; i++) {
                    nr = 0;
                    nrCorecte = 0;
                    for (j = 0; j < nrB; j++) {
                        if (v[j] == 1) {
                            nr++;
                        }
                        if (v[j] == 1 && j == Regine.matrice[i][nrCorecte]) {
                            nrCorecte++;
                        }
                    }
                    if (nrCorecte == nr && nr == n) 
                        ok = 1;
                    if (nr < n) {
                        ok = -1;
                    }
                }
                if (ok == -1) {
                    JOptionPane.showMessageDialog(null, "Nu ati pozitionat numarul necesar de regine!");
                }
                if (ok == 1) {
                    JOptionPane.showMessageDialog(null, "Solutia este corecta!");
                }

                if (ok == 0) {
                    JOptionPane.showMessageDialog(null, "Solutia este incorecta!");
                }

            }
        }
    }
}
