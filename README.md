Very simple HMA pro wrapper made to allow Java apps to connect, dissconnect and change HMA Pro IP's

Example Usage

HMA hma = new HMA(OSVersion.BIT_64);

hma.connect();
hma.changeIP();
hma.disconnect();
