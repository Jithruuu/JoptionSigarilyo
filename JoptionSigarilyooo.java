/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
pnSigarilyo;

/**
 *
 * @author USER
 */
import javax.swing.JOptionPane;

public class JoptionSigarilyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, " Bienvenido a la Jethoooy Sigarilyo Store ");
        double total = 0, v, gay, ga, bv = 0, totals = 0, add = 0, h, price = 0, mm = 0, k = 0, prices = 0, ke = 0, nn = 0, mj = 0;
        String againe, yu, n, me, again, select, kk = "";
        int tom = 5, mn;
        String pl = "", pp = "";
        String orderreciept = "", reciept = "", name = "", names = "", nj = "";

        do {
            do {
                double currenttotal = 0;

                do {

                    JOptionPane.showMessageDialog(null, " AVAIL A MINIMUM OF 500 PESOS WORTH OF CIGARETTES WE HAVE 10PERCENT DISCOUNT! ");
                    select = JOptionPane.showInputDialog(null, "SELECT CIGARETTE \n"
                            + "TYPE 1 FOR Mighty:60 pesos\n"
                            + "TYPE 2 FOR Marlboro:50 pesos\n"
                            + "TYPE 3 FOR More: 10 pesos\n"
                            + "TYPE 4 FOR Winston: 15 pesos\n"
                            + "TYPE 5 FOR Aries:25 pesos ");

                    if (select.equalsIgnoreCase("1")) {
                        name = "Mighty";
                        price = 60;
                        JOptionPane.showMessageDialog(null, "YOU SELECTED MIGHTY: ");
                        k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                        currenttotal = price * k;

                    } else if (select.equalsIgnoreCase("2")) {
                        name = "Marlboro";
                        price = 50;
                        JOptionPane.showMessageDialog(null, "YOU SELECTED MARLBORO: ");
                        k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                        currenttotal = price * k;

                    } else if (select.equalsIgnoreCase("3")) {
                        name = "More";
                        price = 10;
                        JOptionPane.showMessageDialog(null, "YOU SELECTED MORE: ");
                        k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                        currenttotal = price * k;

                    } else if (select.equalsIgnoreCase("4")) {
                        name = "Winston";
                        price = 15;
                        JOptionPane.showMessageDialog(null, "YOU SELECTED WINSTON: ");
                        k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                        currenttotal = price * k;

                    } else if (select.equalsIgnoreCase("5")) {
                        name = "Aries";
                        price = 25;
                        JOptionPane.showMessageDialog(null, "YOU SELECTED ARIES:");
                        k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                        currenttotal = price * k;

                    } else {
                        JOptionPane.showMessageDialog(null, "NOT VALID");
                    }

                    me = JOptionPane.showInputDialog(null, "ENTER R IF REPEAT C IF CONTINUE");

                    if (me.equalsIgnoreCase("r")) {
                        JOptionPane.showMessageDialog(null, "REPEAT");
                        add = currenttotal;
                        orderreciept = "";

                    } else if (me.equalsIgnoreCase("c")) {

                    }

                } while (me.equalsIgnoreCase("R"));
                total += currenttotal;
                {
                    double count;
                    orderreciept += name + " x " + k + " = " + (price * k) + " pesos\n";
                    if (total >= 500) {
                        JOptionPane.showMessageDialog(null, "avail promo");
                        count = currenttotal * 0.1;
                        total -= count;
                        orderreciept += "DISCOUNT: 10% (-" + count + " pesos)\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "NOT AVAIL PROMO");
                    }
                }
                JOptionPane.showMessageDialog(null, "YOUR TOTAL IS : " + total);
                orderreciept += "TOTAL BILL: " + total + " pesos\n";
                reciept += orderreciept;
                again = JOptionPane.showInputDialog(null, "ENTER yes IF BUY AGAIN AND no IF STOP ");

                if (again.equals("yes")) {
                    JOptionPane.showMessageDialog(null, "ADD ANOTHER CIGARETTE");

                } else if (again.equals("no")) {
                    JOptionPane.showMessageDialog(null, "done");
                }

            } while (again.equalsIgnoreCase("yes"));

            for (mn = 1; mn < 5; mn++) {
                if (mn == tom - 1) {
                    JOptionPane.showMessageDialog(null, "INPUT CASH LIMITS TRANSACTION FAILED");

                    mn = -1;
                    break;

                } else {
                    h = Double.parseDouble(JOptionPane.showInputDialog("ENTER CASH " + mn + " / 3"));
                    JOptionPane.showMessageDialog(null, "YOUR CASH IS " + h);
                    bv += h;

                    {
                        if (bv >= total) {
                            mm = bv - total;
                            JOptionPane.showMessageDialog(null, "YOUR CHANGE IS " + mm);
                            break;

                        } else {
                            JOptionPane.showMessageDialog(null, "NOT ENOUGH PAYMENT");
                            JOptionPane.showMessageDialog(null, "YOUR BALANCE IS " + (total - bv));
                        }

                    }
                }
            }
            JOptionPane.showMessageDialog(null, "RECEIPT:\n" + reciept + "CASH " + bv + " pesos\nCHANGE " + mm + " pesos");
        } while (bv < 0);

        do {
            String l = JOptionPane.showInputDialog(null, "ENTER 'yes' IF YOU WANT TO DO ANOTHER TRANSACTION AND 'no' IF YOU WANT TO STOP");
            double vb = 0;

            if (l.equalsIgnoreCase("yes")) {

                do {
                    double currentTotals = 0;

                    do {

                        JOptionPane.showMessageDialog(null, "  AVAIL A MINIMUM OF 500 PESOS WORTH OF CIGARETTES WE HAVE 10PERCENT DISCOUNT! ");
                        String selecte = JOptionPane.showInputDialog(null, "SELECT CIGARETTE \n"
                                + "TYPE 1 FOR Mighty:60 pesos\n"
                                + "TYPE 2 FOR Marlboro:50 pesos\n"
                                + "TYPE 3 FOR More: 10 pesos\n"
                                + "TYPE 4 FOR Winston: 15 pesos\n"
                                + "TYPE 5 FOR Aries:25 pesos ");

                        if (select.equalsIgnoreCase("1")) {
                            name = "Mighty";
                            price = 60;
                            JOptionPane.showMessageDialog(null, "YOU SELECTED MIGHTY: ");
                            k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                            double currenttotal = price * k;

                        } else if (select.equalsIgnoreCase("2")) {
                            name = "Marlboro";
                            price = 50;
                            JOptionPane.showMessageDialog(null, "YOU SELECTED MARLBORO: ");
                            k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                            double currenttotal = price * k;

                        } else if (select.equalsIgnoreCase("3")) {
                            name = "More";
                            price = 10;
                            JOptionPane.showMessageDialog(null, "YOU SELECTED MORE: ");
                            k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                            double currenttotal = price * k;

                        } else if (select.equalsIgnoreCase("4")) {
                            name = "Winston";
                            price = 15;
                            JOptionPane.showMessageDialog(null, "YOU SELECTED WINSTON: ");
                            k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                            double currenttotal = price * k;

                        } else if (select.equalsIgnoreCase("5")) {
                            name = "Aries";
                            price = 25;
                            JOptionPane.showMessageDialog(null, "YOU SELECTED ARIES:");
                            k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                            double currenttotal = price * k;

                        } else {
                            JOptionPane.showMessageDialog(null, "NOT VALID");
                        }
                        n = JOptionPane.showInputDialog("ENTER R IF REPEAT C IF CONTINUE");

                        if (n.equalsIgnoreCase("r")) {
                            JOptionPane.showMessageDialog(null, "REPEAT");
                            add = currentTotals;
                        }
                        pl = "";

                    } while (n.equalsIgnoreCase("R"));
                    totals += currentTotals;
                    {
                        double u;
                        pl += names + " x " + ke + " = " + (prices * ke) + " pesos\n";

                        if (totals >= 500) {
                            JOptionPane.showMessageDialog(null, "avail promo");
                            u = currentTotals * 0.1;
                            totals -= u;
                            pl += "DISCOUNT: 10% (-" + u + " pesos)\n";

                        } else {
                            JOptionPane.showMessageDialog(null, "NOT AVAIL PROMO");
                        }
                    }
                    JOptionPane.showMessageDialog(null, "YOUR CURRENT TOTAL BILLS: " + totals);
                    pl += "TOTAL BILL: " + totals + " pesos\n";
                    pp += pl;
                    againe = JOptionPane.showInputDialog(null, "ENTER yes IF YOU WANT TO BUY AGAIN AND no IF YOU WANT TO STOP ");

                } while (againe.equalsIgnoreCase("yes"));
                for (mn = 1; mn < 5; mn++) {
                    if (mn == tom - 1) {
                        JOptionPane.showMessageDialog(null, "INPUT CASH LIMITS TRANSACTION FAILED");

                        mn = -1;
                        break;

                    } else {
                        v = Double.parseDouble(JOptionPane.showInputDialog("ENTER CASH " + mn + " / 3"));
                        JOptionPane.showMessageDialog(null, "YOUR CASH IS " + v);
                        vb += v;

                        {
                            if (vb >= totals) {
                                nn = vb - totals;
                                JOptionPane.showMessageDialog(null, "YOUR CHANGE IS " + nn);
                                break;

                            } else {
                                JOptionPane.showMessageDialog(null, "NOT ENOUGH PAYMENT");
                                JOptionPane.showMessageDialog(null, "YOUR BALANCE IS " + (totals - vb));
                            }

                        }
                    }
                }

                JOptionPane.showMessageDialog(null, "RECEIPT:\n" + pp + "CASH " + vb + " pesos\nCHANGE " + nn + " pesos");
                pp = nj;
                vb = mj;
                totals = mj;
                nn = mj;
            } else if (l.equalsIgnoreCase("no")) {
                JOptionPane.showMessageDialog(null, " Thank you and Come again :) ");
                break;
            }
        } while (true);
    }
}
ackage JoptionSigarilyo;

/**
 *
 * @author USER
 */
import javax.swing.JOptionPane;

public class JoptionSigarilyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, " Bienvenido a la Jethoooy Sigarilyo Store ");
        double total = 0, v, gay, ga, bv = 0, totals = 0, add = 0, h, price = 0, mm = 0, k = 0, prices = 0, ke = 0, nn = 0, mj = 0;
        String againe, yu, n, me, again, select, kk = "";
        int tom = 5, mn;
        String pl = "", pp = "";
        String orderreciept = "", reciept = "", name = "", names = "", nj = "";

        do {
            do {
                double currenttotal = 0;

                do {

                    JOptionPane.showMessageDialog(null, " AVAIL A MINIMUM OF 500 PESOS WORTH OF CIGARETTES WE HAVE 10PERCENT DISCOUNT! ");
                    select = JOptionPane.showInputDialog(null, "SELECT CIGARETTE \n"
                            + "TYPE 1 FOR Mighty:60 pesos\n"
                            + "TYPE 2 FOR Marlboro:50 pesos\n"
                            + "TYPE 3 FOR More: 10 pesos\n"
                            + "TYPE 4 FOR Winston: 15 pesos\n"
                            + "TYPE 5 FOR Aries:25 pesos ");

                    if (select.equalsIgnoreCase("1")) {
                        name = "Mighty";
                        price = 60;
                        JOptionPane.showMessageDialog(null, "YOU SELECTED MIGHTY: ");
                        k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                        currenttotal = price * k;

                    } else if (select.equalsIgnoreCase("2")) {
                        name = "Marlboro";
                        price = 50;
                        JOptionPane.showMessageDialog(null, "YOU SELECTED MARLBORO: ");
                        k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                        currenttotal = price * k;

                    } else if (select.equalsIgnoreCase("3")) {
                        name = "More";
                        price = 10;
                        JOptionPane.showMessageDialog(null, "YOU SELECTED MORE: ");
                        k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                        currenttotal = price * k;

                    } else if (select.equalsIgnoreCase("4")) {
                        name = "Winston";
                        price = 15;
                        JOptionPane.showMessageDialog(null, "YOU SELECTED WINSTON: ");
                        k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                        currenttotal = price * k;

                    } else if (select.equalsIgnoreCase("5")) {
                        name = "Aries";
                        price = 25;
                        JOptionPane.showMessageDialog(null, "YOU SELECTED ARIES:");
                        k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                        currenttotal = price * k;

                    } else {
                        JOptionPane.showMessageDialog(null, "NOT VALID");
                    }

                    me = JOptionPane.showInputDialog(null, "ENTER R IF REPEAT C IF CONTINUE");

                    if (me.equalsIgnoreCase("r")) {
                        JOptionPane.showMessageDialog(null, "REPEAT");
                        add = currenttotal;
                        orderreciept = "";

                    } else if (me.equalsIgnoreCase("c")) {

                    }

                } while (me.equalsIgnoreCase("R"));
                total += currenttotal;
                {
                    double count;
                    orderreciept += name + " x " + k + " = " + (price * k) + " pesos\n";
                    if (total >= 500) {
                        JOptionPane.showMessageDialog(null, "avail promo");
                        count = currenttotal * 0.1;
                        total -= count;
                        orderreciept += "DISCOUNT: 10% (-" + count + " pesos)\n";
                    } else {
                        JOptionPane.showMessageDialog(null, "NOT AVAIL PROMO");
                    }
                }
                JOptionPane.showMessageDialog(null, "YOUR TOTAL IS : " + total);
                orderreciept += "TOTAL BILL: " + total + " pesos\n";
                reciept += orderreciept;
                again = JOptionPane.showInputDialog(null, "ENTER yes IF BUY AGAIN AND no IF STOP ");

                if (again.equals("yes")) {
                    JOptionPane.showMessageDialog(null, "ADD ANOTHER CIGARETTE");

                } else if (again.equals("no")) {
                    JOptionPane.showMessageDialog(null, "done");
                }

            } while (again.equalsIgnoreCase("yes"));

            for (mn = 1; mn < 5; mn++) {
                if (mn == tom - 1) {
                    JOptionPane.showMessageDialog(null, "INPUT CASH LIMITS TRANSACTION FAILED");

                    mn = -1;
                    break;

                } else {
                    h = Double.parseDouble(JOptionPane.showInputDialog("ENTER CASH " + mn + " / 3"));
                    JOptionPane.showMessageDialog(null, "YOUR CASH IS " + h);
                    bv += h;

                    {
                        if (bv >= total) {
                            mm = bv - total;
                            JOptionPane.showMessageDialog(null, "YOUR CHANGE IS " + mm);
                            break;

                        } else {
                            JOptionPane.showMessageDialog(null, "NOT ENOUGH PAYMENT");
                            JOptionPane.showMessageDialog(null, "YOUR BALANCE IS " + (total - bv));
                        }

                    }
                }
            }
            JOptionPane.showMessageDialog(null, "RECEIPT:\n" + reciept + "CASH " + bv + " pesos\nCHANGE " + mm + " pesos");
        } while (bv < 0);

        do {
            String l = JOptionPane.showInputDialog(null, "ENTER 'yes' IF YOU WANT TO DO ANOTHER TRANSACTION AND 'no' IF YOU WANT TO STOP");
            double vb = 0;

            if (l.equalsIgnoreCase("yes")) {

                do {
                    double currentTotals = 0;

                    do {

                        JOptionPane.showMessageDialog(null, "  AVAIL A MINIMUM OF 500 PESOS WORTH OF CIGARETTES WE HAVE 10PERCENT DISCOUNT! ");
                        String selecte = JOptionPane.showInputDialog(null, "SELECT CIGARETTE \n"
                                + "TYPE 1 FOR Mighty:60 pesos\n"
                                + "TYPE 2 FOR Marlboro:50 pesos\n"
                                + "TYPE 3 FOR More: 10 pesos\n"
                                + "TYPE 4 FOR Winston: 15 pesos\n"
                                + "TYPE 5 FOR Aries:25 pesos ");

                        if (select.equalsIgnoreCase("1")) {
                            name = "Mighty";
                            price = 60;
                            JOptionPane.showMessageDialog(null, "YOU SELECTED MIGHTY: ");
                            k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                            double currenttotal = price * k;

                        } else if (select.equalsIgnoreCase("2")) {
                            name = "Marlboro";
                            price = 50;
                            JOptionPane.showMessageDialog(null, "YOU SELECTED MARLBORO: ");
                            k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                            double currenttotal = price * k;

                        } else if (select.equalsIgnoreCase("3")) {
                            name = "More";
                            price = 10;
                            JOptionPane.showMessageDialog(null, "YOU SELECTED MORE: ");
                            k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                            double currenttotal = price * k;

                        } else if (select.equalsIgnoreCase("4")) {
                            name = "Winston";
                            price = 15;
                            JOptionPane.showMessageDialog(null, "YOU SELECTED WINSTON: ");
                            k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                            double currenttotal = price * k;

                        } else if (select.equalsIgnoreCase("5")) {
                            name = "Aries";
                            price = 25;
                            JOptionPane.showMessageDialog(null, "YOU SELECTED ARIES:");
                            k = Double.parseDouble(JOptionPane.showInputDialog(null, " ENTER QUANTITY"));
                            double currenttotal = price * k;

                        } else {
                            JOptionPane.showMessageDialog(null, "NOT VALID");
                        }
                        n = JOptionPane.showInputDialog("ENTER R IF REPEAT C IF CONTINUE");

                        if (n.equalsIgnoreCase("r")) {
                            JOptionPane.showMessageDialog(null, "REPEAT");
                            add = currentTotals;
                        }
                        pl = "";

                    } while (n.equalsIgnoreCase("R"));
                    totals += currentTotals;
                    {
                        double u;
                        pl += names + " x " + ke + " = " + (prices * ke) + " pesos\n";

                        if (totals >= 500) {
                            JOptionPane.showMessageDialog(null, "avail promo");
                            u = currentTotals * 0.1;
                            totals -= u;
                            pl += "DISCOUNT: 10% (-" + u + " pesos)\n";

                        } else {
                            JOptionPane.showMessageDialog(null, "NOT AVAIL PROMO");
                        }
                    }
                    JOptionPane.showMessageDialog(null, "YOUR CURRENT TOTAL BILLS: " + totals);
                    pl += "TOTAL BILL: " + totals + " pesos\n";
                    pp += pl;
                    againe = JOptionPane.showInputDialog(null, "ENTER yes IF YOU WANT TO BUY AGAIN AND no IF YOU WANT TO STOP ");

                } while (againe.equalsIgnoreCase("yes"));
                for (mn = 1; mn < 5; mn++) {
                    if (mn == tom - 1) {
                        JOptionPane.showMessageDialog(null, "INPUT CASH LIMITS TRANSACTION FAILED");

                        mn = -1;
                        break;

                    } else {
                        v = Double.parseDouble(JOptionPane.showInputDialog("ENTER CASH " + mn + " / 3"));
                        JOptionPane.showMessageDialog(null, "YOUR CASH IS " + v);
                        vb += v;

                        {
                            if (vb >= totals) {
                                nn = vb - totals;
                                JOptionPane.showMessageDialog(null, "YOUR CHANGE IS " + nn);
                                break;

                            } else {
                                JOptionPane.showMessageDialog(null, "NOT ENOUGH PAYMENT");
                                JOptionPane.showMessageDialog(null, "YOUR BALANCE IS " + (totals - vb));
                            }

                        }
                    }
                }

                JOptionPane.showMessageDialog(null, "RECEIPT:\n" + pp + "CASH " + vb + " pesos\nCHANGE " + nn + " pesos");
                pp = nj;
                vb = mj;
                totals = mj;
                nn = mj;
            } else if (l.equalsIgnoreCase("no")) {
                JOptionPane.showMessageDialog(null, " Thank you and Come again :) ");
                break;
            }
        } while (true);
    }
}
