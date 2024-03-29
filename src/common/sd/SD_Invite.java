/*- SD_Invite.java -----------------------------------------------+
 |                                                                 |
 |  Copyright (C) 2002-2003 Joseph Monti, LlamaChat                |
 |                     countjoe@users.sourceforge.net              |
 |                     http://www.42llamas.com/LlamaChat/          |
 |                                                                 |
 | This program is free software; you can redistribute it and/or   |
 | modify it under the terms of the GNU General Public License     |
 | as published by the Free Software Foundation; either version 2  |
 | of the License, or (at your option) any later version           |
 |                                                                 |
 | This program is distributed in the hope that it will be useful, |
 | but WITHOUT ANY WARRANTY; without even the implied warranty of  |
 | MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the   |
 | GNU General Public License for more details.                    |
 |                                                                 |
 | A copy of the GNU General Public License may be found in the    |
 | installation directory named "GNUGPL.txt"                       |
 |                                                                 |
 +-----------------------------------------------------------------+
 */

package common.sd;

import java.io.Serializable;
import common.SocketConnection;

/* -------------------- JavaDoc Information ----------------------*/
/**
 * Replace information on this file with your file's information.
 * @author Grupo# 2 Maestria APlicada en Redes
 * @version 0.8
 */
public class SD_Invite implements SocketData, Serializable {
	private String userName;
	private String message;

	public SD_Invite(String un, String m) {
		userName = un;
		message = m;
	}

	public void performAction(SocketConnection sc) {
		sc.invite(userName, message);
	}
}
