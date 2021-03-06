package stryker4s.testutil.stubs

import better.files.File
import stryker4s.mutants.findmutants.SourceCollector

class TestSourceCollector(returns: Iterable[File]) extends SourceCollector {
  override def collectFilesToMutate(): Iterable[File] = returns
  override def filesToCopy: Iterable[File] = returns
}
