/* 
 *  this project will be in progress throughout the current semester.
 *                                
 *                              Project Outline:
 * "You have assumed the role of managing the technology infrastructure at a zoo
 *  You will develop a working program (either an authentication system or a monitoring system)
 *  for the zoo designed to follow the specifications outlined in the overview.
 *  You will also provide detailed documentation describing your development process.
 *
 *
 *                              DETAILS:
 *  The Authentication System
 *
 * Asks user for a USERNAME
 * Asks user for a PASSWORD
 * CONVERTS the PASSWORD using MD5(message digest five) hash.
 * CHECKS CREDENTIALS against the VALID CREDENTIALS provided in the CREDENTIALS file
 * LIMITS FAILED attempts to (3) BEFORE notifying user and EXITING program
 * GIVES authenticated users access to the correct role file after successful authentication
 *    SYSTEM INFORMATION stored in the ROLE file should be DISPLAYED. 
 *    (i.e. Zookeeper CREDENTIALS "AUTHENTICATED", display ZOOKEEPER files.)
 * ALLOWS user to LOG OUT
 * STAYS on CREDENTIALS screen UNTIL after a SUCCESSFUL LOGIN, or (3) UNSUCCESSFUL ATTEMPTS,
 *    OR USER EXIT.
