interfaces {
    ethernet eth0 {
        address 192.168.1.1/24
    }
    ethernet eth1 {
    }
    ethernet eth2 {
    }
    loopback lo {
    }
}

service {
    gui {
    }
    ssh {
    }
}

system {
    login {
        user ubnt {
            authentication {
                encrypted-password "$1$zKNoUbAo$gomzUbYvgyUMcD436Wo66."
            }
            level admin
        }
    }
    ntp {
        server 0.ubnt.pool.ntp.org {
        }
        server 1.ubnt.pool.ntp.org {
        }
        server 2.ubnt.pool.ntp.org {
        }
        server 3.ubnt.pool.ntp.org {
        }
    }
    syslog {
        global {
            facility all {
                level notice
            }
            facility protocols {
                level debug
            }
        }
    }
}


/* Warning: Do not remove the following line. */
/* === vyatta-config-version: "zone-policy@1:ipsec@3:ubnt-pptp@1:quagga@2:firewall@4:webgui@1:qos@1:vrrp@1:config-management@1:nat@3:dhcp-server@4:dhcp-relay@1:system@4:webproxy@1" === */
/* Release version: v1.2.0.4574253.130626.1248 */
