# scalaring

`scalaring` explores distributed systems with a small Scala codebase and local fixtures. The technical goal is to simulate actor ring routing and failure detection traces.

## Problem It Tries To Make Smaller

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how quorum health and replica lag should influence a review result.

## Scalaring Review Notes

`stale` and `edge` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Working Pieces

- `fixtures/domain_review.csv` adds cases for quorum health and lease drift.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/scalaring-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `quorum health` and `replica lag`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Design Notes

The fixture data drives the tests. The code stays thin, while `metadata/domain-review.json` and `config/review-profile.json` explain what each case is meant to protect.

The Scala addition stays small enough to inspect in one sitting.

## Example Run

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The same command runs the local verification path. The highest-scoring domain case is `stale` at 217, which lands in `ship`. The most cautious case is `edge` at 145, which lands in `ship`.

## Known Limits

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
