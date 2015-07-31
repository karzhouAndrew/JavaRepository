package jd3task7.dao;

import jd3task7.entity.Receiver;

import java.util.List;

/**
 * Created by Master on 02.07.2015.
 */
public interface ReceiverDAO {
    void addReceiver(Receiver receiver) throws ClassNotFoundException;

    List<Receiver> getReceivers() throws ClassNotFoundException;
}
