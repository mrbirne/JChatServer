/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.lsmb.jchatserver;

import de.dhbw.lsmb.jchatserver.models.Message;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 *
 * @author Maurice Busch <busch.maurice@gmx.net>
 */

public class HistoryResource extends ServerResource {

    @Get
    public Message represent() {
        return new Message("Hallo", 1);
    }

}
