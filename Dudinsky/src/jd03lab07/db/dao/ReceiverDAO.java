package jd03lab07.db.dao;

import jd03lab07.entities.Receiver;

import java.util.List;

public interface ReceiverDAO {

    Receiver retrieveReceiver(final int num);

    List<Receiver> retrieveAllReceivers();

    int insertReceiver(final Receiver receiver);
}