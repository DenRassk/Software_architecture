package dz8.Presenters;

import dz8.Models.Table;

import java.util.Collection;

public interface View {

    void registerObserver(ViewObserver observer);

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void showChangeReservationTableResult(int reservationNo);
}
