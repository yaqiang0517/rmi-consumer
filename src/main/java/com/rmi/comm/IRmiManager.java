package com.rmi.comm;

import java.rmi.RemoteException;

public interface IRmiManager {

    public Account getAccount() throws RemoteException;
}
