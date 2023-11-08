package dz8;

import dz8.Models.TableModel;
import dz8.Presenters.BookingPresenter;
import dz8.Presenters.Model;
import dz8.Views.BookingView;

import java.util.Date;

public class Program {

    //TODO: метод changeReservationTable должен заработать
    public static void main(String[] args) {
        Model model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateTables();

        view.reservationTable(new Date(), 3, "Станислав");
        view.reservationTable(new Date(), 2, "Денис");
        view.reservationTable(new Date(), 3, "Иван");
        view.reservationTable(new Date(), 4, "Евгений");
        view.reservationTable(new Date(), 6, "Василий");
        view.changeReservationTable(1004, new Date(), 5, "Станислав");
        view.changeReservationTable(1003, new Date(), 6, "Василий");
        view.changeReservationTable(1005, new Date(), 2, "Пётр");
    }

}
