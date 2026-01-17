# Distributed Circuit Breaker

Production-grade circuit breaker implementation for distributed systems using Resilience4j and Redis.

## What This Solves

Prevents cascading failures in distributed microservices by breaking circuits when downstream services fail. Unlike basic implementations, this handles:

- **Multi-instance coordination** - Circuit state shared across service instances via Redis
- **Distributed state management** - Consistent failure tracking across the cluster
- **Production-grade configurations** - Real-world thresholds, not tutorial defaults
- **Operational visibility** - Metrics, logging, and failure pattern analysis

## Why This Matters

Based on fault-tolerance patterns used in telecom infrastructure handling millions of requests/day. Focuses on real distributed systems problems:
- How circuit state propagates across instances
- Handling network partitions and Redis failures
- Trade-offs between local vs distributed state
- When NOT to use circuit breakers

## Tech Stack

- Spring Boot 3.x
- Resilience4j
- Redis (distributed state)
- Micrometer (metrics)
- Docker Compose

## Status

Implementation in progress. Full code coming soon.

## Author

Harshavardhanan Aranga  
[LinkedIn](https://www.linkedin.com/in/harshavardhanan2990/) | [Website](https://www.pragmaticbyharsh.com/)
