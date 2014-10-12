#!/usr/bin/env python


import socket
import sys
import avro.ipc as ipc
import avro.protocol as protocol

#PROTOCOL = protocol.parse(open("../avro/tweet.avpr").read())
TCP_IP = '127.0.0.1'
TCP_PORT = 5005
BUFFER_SIZE = 1024
MESSAGE = "Hello, World!\n"

# fill in the Message record and send it
#message = dict()
#message['auteur'] = sys.argv[1]
#message['corps'] = sys.argv[2]



s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((TCP_IP, TCP_PORT))
s.send(MESSAGE)
data = s.recv(BUFFER_SIZE)
s.close()

print "received data:", data
