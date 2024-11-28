package pkg1p51;
import javax.swing.*;
public class UAS_Praktik {
    public static String ket1, ket2, ket3, puls, pkt;
    public static int x, no_data, byar, tot_puls=0, hrg;
    public static float pajak=0f, bayar=0f, kembali=0f, tot_pkt=0f;
    
    private static int h;
    private static int jh;
    private static int x1;
    private static int x2;
    private static String tampil;
    private static int t;
    private static int t_data;
    private static int no;
    
    public static void main(String[] args)
    {
        no_data=0;
        String nomor[] = null;
        nomor = new String[100];
        
        String nama[] = null;
        nama = new String[100];
        
        String paket[] = null;
        paket = new String[100];
        
        int pulsa[] = null;
        pulsa = new int [100];
        
        String lagi="y";
        boolean keluar = true;
        do
        {
            if(x==99)
            {
                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
            }
            else
            {
                do
                {
                    x=x+1; no_data = no_data + 1;
                    String hasil="";
                    String nmr = JOptionPane.showInputDialog("NOMOR PELANGGAN");
                    nomor[x] = nmr;
                    
                    String nm = JOptionPane.showInputDialog("NAMA PELANGGAN");
                    nama[x] = nm;
                    
                    do
                    {
                          puls = JOptionPane.showInputDialog("       PULSA       \n A. 25.000\n B. 50.000\n C. 100.000\n "
                                + "D. 200.000\n E. 300.000\n F. 400.000\n");
                    }
                    while(!("a".equals(puls) | "A".equals(puls) | "b".equals(puls) | "B".equals(puls) | "c".equals(puls) | "C".equals(puls)
                            | "d".equals(puls) | "D".equals(puls) | "e".equals(puls) | "E".equals(puls) | "f".equals(puls) | "F".equals(puls)));
                    
                    if("a".equals(puls) | "A".equals(puls))
                    {
                        ket1 = "25.000"; hrg = 25000;
                    }
                    if("b".equals(puls) | "B".equals(puls))
                    {
                        ket1 = "50.000"; hrg = 50000;
                    }
                    if("c".equals(puls) | "C".equals(puls))
                    {
                        ket1 = "100.000"; hrg = 100000;
                    }
                    if("d".equals(puls) | "D".equals(puls))
                    {
                        ket1 = "200.000"; hrg = 200000;
                    }
                    if("e".equals(puls) | "E".equals(puls))
                    {
                        ket1 = "300.000"; hrg = 300000;
                    }
                    if("f".equals(puls) | "F".equals(puls))
                    {
                        ket1 = "400.000"; hrg = 400000;
                    }
                    
                    do
                    {
                         pkt = JOptionPane.showInputDialog("       PAKET       \n A. 16.4 Kwh\n B. 23.8 Kwh\n "
                                + "C. 50.9 Kwh\n D. 160.3 Kwh\n E. 210.1 Kwh\n F. 320.7 Kwh\n");
                    }
                    while(!("a".equals(pkt) | "A".equals(pkt) | "b".equals(pkt) | "B".equals(pkt) | "c".equals(pkt) | "C".equals(pkt)
                            | "d".equals(pkt) | "D".equals(pkt) | "e".equals(pkt) | "E".equals(pkt) | "f".equals(pkt) | "F".equals(pkt)));
                    
                    if("a".equals(pkt) | "A".equals(pkt))
                    {
                        ket2 = "16.4 Kwh";
                    }
                    if("b".equals(pkt) | "B".equals(pkt))
                    {
                        ket2 = "23.8 Kwh";
                    }
                    if("c".equals(pkt) | "C".equals(pkt))
                    {
                        ket2 = "50.9 Kwh";
                    }
                    if("d".equals(pkt) | "D".equals(pkt))
                    {
                        ket2 = "160.3 Kwh";
                    }
                    if("e".equals(pkt) | "E".equals(pkt))
                    {
                        ket2 = "210.1 Kwh";
                    }
                    if("f".equals(pkt) | "F".equals(pkt))
                    {
                        ket2 = "320.7 Kwh";
                    }
                   
                    String byr = JOptionPane.showInputDialog("BAYAR");
                    byar = Integer.parseInt(byr);
                    
                    String pjk = JOptionPane.showInputDialog("PAJAK");
                    pajak = Float.parseFloat(pjk);
                    
                    bayar = hrg + pajak;
                    kembali = byar - bayar;
                    tot_puls = tot_puls + hrg;
                    
                    hasil += "---------------------------------------------------------------------\n";
                    hasil += " No. Antri : "+no_data+" \n";
                    hasil += "                              PENJUALAN PULSA LISTRIK                 \n";
                    hasil += " 1. NO PELANGGAN  = "+nomor[x]+" \n";
                    hasil += " 2. NAMA PELANGGAN    = "+nama[x]+" \n";
                    hasil += " 3. PULSA     = "+puls+" "+ket1+"\n";
                    hasil += " 4. KILO WATH (Kwh) = "+pkt+" "+ket2+" Kwh \n";
                    hasil += " 5. BAYAR     = "+bayar+" \n";
                    hasil += " 6. KEMBALI  = "+kembali+" \n";
                    hasil += "---------------------------------------------------------------------\n";
                    JOptionPane.showMessageDialog(null,hasil,"DATA PENJUALAN",JOptionPane.INFORMATION_MESSAGE);
                    do
                    {
                         lagi = JOptionPane.showInputDialog("INPUT PENJUALAN [Y/T]");
                    }
                    while (!(("y".equals(lagi)) | ("Y".equals(lagi)) | ("t".equals(lagi)) | ("T".equals(lagi))));
            }
                while (("y".equals(lagi)) | ("Y".equals(lagi)));
        }
            keluar = false;
        }
        while(keluar);
        t_data = x +1;        
        h = t_data % 3;
        if (h == 0)
        {
            jh = t_data /3;
        }
        else
        {
            jh = (t_data / 3) + 1;
        }
        
        if (jh == 1)
        {
            x1 = 0;
            x2 = x;
        }
        else
        {
            x1 =  0;
            x2 =  2;
        }
        no = 0;
        for (int y=1; y<=jh; y=y+1)
        {
            tampil += "                                   LAPORAN PENJUALAN LISTRIK               HAL : "+y+"   \n";
            tampil += "----------------------------------------------------------------------------------------\n";
            tampil += " NO  NO. PELANGGAN       NAMA        PULSA       Kwh     PAJAK       BAYAR       KEMBALI \n";
            tampil += "----------------------------------------------------------------------------------------\n";
            tampil += " "+no+"    "+nomor[y]+"      "+nama[y]+"     "+puls+"   "+pkt+"     "+byar+"     "+kembali+" \n";
            tampil += "----------------------------------------------------------------------------------------\n";
            tampil += " TOTAL Kwh = "+tot_pkt+"                     TOTAL PULSA = "+tot_puls+" \n";
            JOptionPane.showMessageDialog(null,tampil," DATA LAPORAN PENJUALAN",JOptionPane.INFORMATION_MESSAGE);
            if (y==jh)
            {
                x2=x;
            }
            x1 = x1+3;
            x2 = x2+3;
        }
        
    }
}

