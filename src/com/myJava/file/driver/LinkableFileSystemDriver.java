package com.myJava.file.driver;

/**
 * Interface d�finissant un driver "chainable", c'est � dire s'appuyant sur un driver pr�d�cesseur
 * pour les acc�s disque.
 * <BR>L'impl�mentation d'un tel driver impose donc de se r�f�rer syst�matiquement au pr�d�cesseur pour
 * l'acc�s au FileSystem, et interdit tout acc�s direct. 
 *
 * <BR>
 * @author Olivier PETRUCCI
 * <BR>
 * <BR>Areca Build ID : 3675112183502703626
 */
 
 /*
 Copyright 2005-2007, Olivier PETRUCCI.
 
This file is part of Areca.

    Areca is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Areca is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Areca; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
public interface LinkableFileSystemDriver extends FileSystemDriver {
    public FileSystemDriver getPredecessor();
}
