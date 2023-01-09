import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

class BookTicket extends JFrame implements ActionListener {
    JComboBox c1, c2, t, coa, d, m, y, t_ime;
    JLabel title, source, destination, number, train, coach, time, date, month, year, confirm;
    JTextField number_of_tickets;
    JButton book_ticket, cancel;
    BookTicket() {
        JFrame f1 = new JFrame();
        f1.setTitle("Book Your Ticket");
        f1.setBounds(0, 0, 1320, 800);
        f1.setLayout(null);
        f1.setVisible(true);
        title = new JLabel("Book Your Ticket : ");
        f1.add(title);
        title.setLocation(540, 40);
        title.setSize(300, 30);
        title.setFont(new Font("Verdana", Font.PLAIN, 20));
        source = new JLabel("Source : ");
        destination = new JLabel("Destination : ");
        f1.add(source);
        f1.add(destination);
        source.setSize(100, 30);
        destination.setSize(100, 30);
        source.setLocation(340, 120);
        destination.setLocation(640, 120);
        String cities1[] = {"Select", "Mumbai", "Delhi", "Bangalore", "Chennai"};
        String cities2[] = {"Select", "Jaipur", "Ahmedabad", "Kolkata", "Hyderabad"};
        String trains[] = {"Select", "Rajdhani Express", "Duronto Express", "Jan Shatabdi Express", "Vande Bharat Express"};
        String coaches[] = {"Select", "First Class AC", "Two-Tier AC", "Three-Tier AC", "Chair Car AC", "Sleeper Class (Non-AC)"};
        c1 = new JComboBox(cities1);
        c2 = new JComboBox(cities2);
        f1.add(c1);
        f1.add(c2);
        c1.setSize(100, 30);
        c2.setSize(100, 30);
        c1.setLocation(460, 120);
        c2.setLocation(780, 120);  
        train = new JLabel("Select your train : ");
        f1.add(train);
        train.setSize(200, 30);
        train.setLocation(420,200);
        t = new JComboBox(trains);
        f1.add(t);
        t.setSize(200, 30);
        t.setLocation(620, 200);
        coa = new JComboBox(coaches);
        coach = new JLabel("Select your coach : ");
        coach.setSize(200,30);
        coach.setLocation(420, 280);
        f1.add(coach);
        coa.setSize(200,30);
        coa.setLocation(620, 280);
        f1.add(coa);
        number = new JLabel("Number of Tickets : ");
        number.setSize(200,30);
        number.setLocation(420, 360);
        f1.add(number);
        number_of_tickets = new JTextField();
        number_of_tickets.setSize(200, 30);
        number_of_tickets.setLocation(620, 360);
        f1.add(number_of_tickets);
        String dates[] = { "1", "2", "3", "4", "5",
                        "6", "7", "8", "9", "10",
                        "11", "12", "13", "14", "15",
                        "16", "17", "18", "19", "20",
                        "21", "22", "23", "24", "25",
                        "26", "27", "28", "29", "30",
                        "31" };
        String months[] = { "January", "February", "March", "April",
                          "May", "June", "July", "August",
                          "September", "October", "November", "December" };
        String years[] = {"2022", "2023"};
        String ti[] = {"Select", "9:25", "11:10", "13:05", "14:00", "16:50", "17:30", "18:45", "22:20"};
        date = new JLabel("Date : ");
        month = new JLabel("Month : ");
        year = new JLabel("Year : ");
        d = new JComboBox(dates);
        m = new JComboBox(months);
        y = new JComboBox(years);
        date.setSize(100, 30);
        month.setSize(150, 30);
        year.setSize(100, 30);
        d.setSize(60, 30);
        m.setSize(60, 30);
        y.setSize(60, 30);
        d.setLocation(420, 440);
        m.setLocation(620, 440);
        y.setLocation(820, 440);
        date.setLocation(340, 440);
        month.setLocation(540, 440);
        year.setLocation(740, 440);
        f1.add(date);
        f1.add(month);
        f1.add(year);
        f1.add(d);
        f1.add(m);
        f1.add(y);
        time =  new JLabel("Select the time : ");
        time.setSize(200, 30);
        time.setLocation(420, 520);
        f1.add(time);
        t_ime = new JComboBox(ti);
        t_ime.setSize(200, 30);
        t_ime.setLocation(620, 520);
        f1.add(t_ime);
        book_ticket = new JButton("Confirm Ticket");
        book_ticket.setSize(180, 30);
        book_ticket.setLocation(420, 600);
        f1.add(book_ticket);
        cancel = new JButton("Cancel");
        cancel.setSize(180, 30);
        cancel.setLocation(620, 600);
        cancel.addActionListener(this);
        f1.add(cancel);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == c1) {
            System.out.println(c1.getSelectedItem());
        }
        if(e.getSource() == c2) {
            System.out.println(c2.getSelectedItem());
        }
        if(e.getSource() == t) {
            System.out.println(t.getSelectedItem());
        }
        if(e.getSource() == coa) {
            System.out.println(coa.getSelectedItem());
        }
        if(e.getSource() == d) {
            System.out.println(d.getSelectedItem());
        }
        if(e.getSource() == m) {
            System.out.println(m.getSelectedItem());
        }
        if(e.getSource() == y) {
            System.out.println(y.getSelectedItem());
        }
        if(e.getSource() == t_ime) {
            System.out.println(t_ime.getSelectedItem());
        }
        if(e.getSource() == cancel) {
            String def = "";
            number_of_tickets.setText(def);
            c1.setSelectedItem("Select");
            c2.setSelectedItem("Select");
            t.setSelectedItem("Select");
            coa.setSelectedItem("Select");
            d.setSelectedItem("1");
            m.setSelectedItem("January");
            y.setSelectedItem("2022");
            t_ime.setSelectedItem("Select");
        }
    }

}
 
class BookTicketMain {
    public static void main(String[] args) {
        new BookTicket();
    }
}
