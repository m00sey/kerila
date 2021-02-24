# KERILA
Scala implementation of KERI  (Key Event Receipt Infrastructure)

# Introduction

KERILA is an open source go implementation of the [ Key Event Receipt Infrastructure (KERI) ](https://github.com/decentralized-identity/keri), a system designed to provide a secure identifier-based trust spanning layer for any stack. [The current version of the KERI paper can be found here](https://github.com/SmithSamuelM/Papers/blob/master/whitepapers/KERI_WP_2.x.web.pdf).

KERI provides the same security and verifiability properties for transactions as a blockchain or distributed ledger can, without the overhead of requiring an absolute global ordering of transactions. Because of this, there is no need for a canonical chain and thus there is no "KERI Chain" or "KERI Network". KERI Identifiers can be generated independently in a self-sovereign and privacy-preserving manner and are secured via a self-certifying post-quantum resistant key management scheme based on blinded pre-rotation, auditable and flexible key events and a distributed conflict resolution algorithm called KAACE.

# Project Status

This is a personal side project.

**Identifiers:**

- [ ] Create Basic Identifiers
- [ ] Create Self-Addressing Identifiers
- [ ] Create Self-Signing Identifiers
- [ ] Rotate non-Basic Identifiers
- [ ] Record interactions in the event log
- [ ] Simple signing thresholds
- [ ] Multi-signature identifiers
- [ ] Weighted signing threshold
- [ ] Delegation

**Logs**

- [ ] Serialization
- [ ] Verification
    - [ ] Recovery
    - [ ] Delegation Seals
    - [ ] Out of Order Events
- [ ] Storage