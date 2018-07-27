DESCRIPTION = "A Doom Clone based on SDL"
SECTION = "games"
DEPENDS = "virtual/libsdl libsdl-mixer libsdl-net pkgconfig"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

RRECOMMENDS_${PN} = "freedoom"

PV = "2.3.0"
PR = "r0"
SRC_URI = "https://github.com/chocolate-doom/chocolate-doom/archive/chocolate-doom-${PV}.tar.gz"
SRC_URI[md5sum] = "42506f5672fd94d8c2019f4ce0da1c07"
SRC_URI[sha256sum] = "aac52a0b26cd43d6723874feca4bb7c5ea9fd42a04e1be1f07b2c3557bd5a744"


inherit autotools-brokensep gettext pkgconfig


S = "${WORKDIR}/chocolate-doom-chocolate-doom-${PV}"



FILES_${PN} = "/usr/share ${bindir}"


