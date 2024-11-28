package pkg1p51;
import javax.swing.*;
public class UAS_Teori {
    public static String type, ket1, ket2, ket3;
    public static int x, hr, hrg, org, byr1, byr2, byr3, tot_harga=0, tot_bayar=0, krg=0, kmbli=0, lunas=0; 
    public static void main(String[] args)
    {
        String nama [] = null;
        nama = new String [15];
        
        String alamat [] = null;
        alamat = new String [15];
        
        String tanggal [] = null;
        tanggal = new String [15];
        
        String tipe [] = null;
        tipe = new String [15];
        
        x=-1;
        boolean lewat=true, lanjut=true;
        String lapor="", lagi="y";
        boolean keluar = true;
        do
        {
            if(x==14)
            {
                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
            }
            else
            {
                do
                {
                    x = x+1;
                    String hasil="";
                    String nm = JOptionPane.showInputDialog("NAMA PENYEWA VILLA");
                    nama[x] = nm;
                    
                    String almt = JOptionPane.showInputDialog("ALAMAT PENYEWA VILLA");
                    alamat[x] = almt;
                    
                    String tgl = JOptionPane.showInputDialog("TANGGAL SEWA [DD/MM/YYYY]");
                    tanggal[x] = tgl;
                    
                    do
                    {
                        type = JOptionPane.showInputDialog("TYPE VILLA\n A. KAMBOJA\n B. CEMPAKA\n C. ANGGREK\n");
                        tipe[x] = type;
                    }
                    while(!("a".equals(type) | ("A".equals(type) | ("b".equals(type) 
                            | ("B".equals(type) | ("c".equals(type) | ("C".equals(type))))))));
                            
                    if("a".equals(type) | ("A".equals(type)))
                    {
                        ket1 = "KAMBOJA";
                    }
                    if("b".equals(type) | ("B".equals(type)))
                    {
                        ket1 = "CEMPAKA";
                    }
                    if("c".equals(type) | ("C".equals(type)))
                    {
                        ket1 = "ANGGREK";
                    }
                    
                    do
                    {
                        try
                        {
                            do
                            {
                                String hri = JOptionPane.showInputDialog("JUMLAH HARI SEWA\n DI ATAS 2 HARI, MAX  10 HARI\n");
                                hr = Integer.parseInt(hri);
                                lewat = false;
                            }
                            while(!(hr>2 & hr<=10));
                        }
                        catch (Exception e)
                        {
                            lewat = true;
                            JOptionPane.showMessageDialog(null, "ERROR, DATA SALAH INPUT");
                        }
                    }
                    while(lewat);
                    
                    String hrga = JOptionPane.showInputDialog("HARGA SEWA [RP.]");
                    hrg = Integer.parseInt(hrga);
                    
                    do
                    {
                        try
                        {
                            do
                            {
                                String orng = JOptionPane.showInputDialog("JUMLAH ORANG BERKUNJUNG\n MAX 8 ORANG, 0 TIDAK BOLEH\n");
                                org = Integer.parseInt(orng);
                                lanjut = false;
                            }
                            while(!(org>=1 & org<=8));
                        }
                        catch (Exception e)
                        {
                            lanjut = true;
                            JOptionPane.showMessageDialog(null, "ERROR, DATA SALAH INPUT");
                        }
                    }
                    while(lanjut);
                    tot_harga = hrg*hr;
                    
                    String byar1 = JOptionPane.showInputDialog("BAYAR PERTAMA");
                    byr1 = Integer.parseInt(byar1);
                    
                    String byar2 = JOptionPane.showInputDialog("BAYAR KEDUA");
                    byr2 = Integer.parseInt(byar2);
                    
                    String byar3 = JOptionPane.showInputDialog("BAYAR KETIGA");
                    byr3 = Integer.parseInt(byar3);
                    
                    tot_bayar = byr1+byr2+byr3;
                    krg = tot_harga - tot_bayar;
                    kmbli = tot_bayar - tot_harga;
                    
                    if(tot_bayar<tot_harga)
                    {
                        ket3 = "HARUS DIBAYAR Rp. "+krg+"";
                    }
                    if(tot_bayar>tot_harga)
                    {
                        ket3 = "UANG DI KEMBALIKAN "+kmbli+"";
                    }
                    else
                    {
                        ket3 = "LUNAS PEMBAYARAN";
                    }
                    
                    lapor += "   STATUS BAYAR = "+ket3+"\n";
                    JOptionPane.showMessageDialog(null,lapor,"SEWA VILLA",JOptionPane.INFORMATION_MESSAGE);
                    do
                    {
                         lagi = JOptionPane.showInputDialog("INPUT DATA WARGA LAGI [Y/T]");
                    }
                    while (!(("y".equals(lagi)) | ("Y".equals(lagi)) | ("t".equals(lagi)) | ("T".equals(lagi))));
                    }
                while (("y".equals(lagi)) | ("Y".equals(lagi)));
                System.exit(0);
                }
            }
        while(keluar);
        }
    }

